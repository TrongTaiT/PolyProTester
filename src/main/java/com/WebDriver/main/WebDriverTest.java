package com.WebDriver.main;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class WebDriverTest {

	private WebDriver driver;
	private UIMap uimap;
	private UIMap datafile;
	private String workingDir;

	// Declare An Excel Work Book
	HSSFWorkbook workbook;
	// Declare An Excel Work Sheet
	HSSFSheet sheet;
	// Declare A Map Object to hold TestNG results
	Map<String, Object[]> TestNGResults;

	public String driverPath = "C:\\chrome\\chromedriver.exe";

	@BeforeClass(alwaysRun = true) // called first in Test Class
	public void suiteSetUp() {
		// create a new work book
		workbook = new HSSFWorkbook();
		// create a new work sheet
		sheet = workbook.createSheet("TestNG Result Summary");
		TestNGResults = new LinkedHashMap<String, Object[]>();
		// add test result excel file column header
		// write the header in the first row
		TestNGResults.put("1", new Object[] { "Test Step No.", "Action", "Expected Output", "Actual Output" });
		try {
			// Get current working directory and load the data file
			workingDir = System.getProperty("user.dir");
			datafile = new UIMap(workingDir + "\\Resources\\datafile.properties");
			// Get the object map file
			uimap = new UIMap(workingDir + "\\Resources\\locator.properties");

			// Setting up Chrome driver path.
			System.setProperty("webdriver.chrome.driver", driverPath);
			// Launching Chrome browser.
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new IllegalStateException("Can't start the Chrome Web Driver", e);
		}
	}

	@Test(description = "Open the TestNG WebDriver for Login Test", priority = 1)
	public void LaunchWebsite() {
		try {
			driver.get("https://levents.vn/account/login");
			driver.manage().window().maximize();
			TestNGResults.put("2", new Object[] {
					1d,
					"Navigate to demo Website",
					"Site gets opended",
					"Pass"
			});
		} catch (Exception e) {
			TestNGResults.put("2", new Object[] {
					1d,
					"Navigate to demo Website",
					"Site gets opended",
					"Fail"
			});
			Assert.assertTrue(false);
		}
	}
	
	@Test(description = "Fill the Login Details", priority = 2)
	public void FillLoginDetails() {
		try {
			// Get the username element
			WebElement username = driver.findElement(uimap.getLocator("Email_field"));
			username.sendKeys(datafile.getData("username"));

			// Get the password element
			WebElement passwordElement = driver.findElement(uimap.getLocator("Password_field"));
			passwordElement.sendKeys(datafile.getData("password"));

			Thread.sleep(1000);

			TestNGResults.put("3", new Object[] { 2d, "Fill Login form data (Username/Password",
					"Login details gets filled", "Pass" });
		} catch (Exception e) {
			TestNGResults.put("3", new Object[] { 2d, "Fill Login form data (Username/Password",
					"Login details gets filled", "Fail" });
			Assert.assertTrue(false);
		}
	}

	@Test(description = "Perform Login", priority = 3)
	public void DoLogin() {
		try {
			// Click on the Login button
			WebElement loginElement = driver.findElement(uimap.getLocator("Login_button"));
			loginElement.click();

			Thread.sleep(2000);
			// Assert the user login by checking the Online user
			WebElement onlineUser = driver.findElement(uimap.getLocator("online_user"));
			AssertJUnit.assertEquals("Đăng xuất", onlineUser.getText());
			TestNGResults.put("4",
					new Object[] { 3d, "Click Login and verify welcome message", "Login success", "Pass" });
		} catch (Exception e) {
			TestNGResults.put("4",
					new Object[] { 3d, "Click Login and verify welcome message", "Login success", "Fail" });
			Assert.assertTrue(false);
		}
	}
	
	

	@AfterClass
	public void afterClass() {
		Set<String> keySet = TestNGResults.keySet();
		int rownum = 0;
		for (String key : keySet) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = TestNGResults.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date) {
					cell.setCellValue((Date) obj);
				} else if (obj instanceof Boolean) {
					cell.setCellValue((Boolean) obj);
				} else if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Double) {
					cell.setCellValue((Double) obj);
				}
			}
		}
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("SaveTestNGResultToExcel.xls"));
			workbook.write(out);
			out.close();
			System.out.println("Successfully saved Selenium WebDriver " + "TestNG result to Excel File!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// close the browser
		driver.close();
		driver.quit();
	}

}
