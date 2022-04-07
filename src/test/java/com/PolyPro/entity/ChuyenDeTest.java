package com.PolyPro.entity;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChuyenDeTest {
	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}
	
	@Test
	public void setMaCDTest() {
		System.out.println("setMaCD");
		String maCD = "JAV01";
		ChuyenDe cd = new ChuyenDe();
		cd.setMaCD(maCD);
		assertEquals(cd.getMaCD(), maCD);
	}
	
	@Test
	public void getMaCDTest() {
		System.out.println("getMaCD");
		ChuyenDe cd = new ChuyenDe();
		String expected = "JAV01";
		cd.setMaCD("JAV01");
		String result = cd.getMaCD();
		assertEquals(result, expected);
	}
	
	@Test
	public void setTenCDTest() {
		System.out.println("setTenCD");
		String tenCD = "Test tên chuyên đề";
		ChuyenDe cd = new ChuyenDe();
		cd.setTenCD(tenCD);
		assertEquals(cd.getTenCD(), tenCD);
	}
	
	@Test
	public void getTenCDTest() {
		System.out.println("getTenCD");
		ChuyenDe cd = new ChuyenDe();
		String expected = "Test tên chuyên đề";
		cd.setTenCD("Test tên chuyên đề");
		String result = cd.getTenCD();
		assertEquals(result, expected);
	}
	
	@Test
	public void setHocPhiTest() {
		System.out.println("setHocPhi");
		double hocPhi = 8250.201;
		ChuyenDe cd = new ChuyenDe();
		cd.setHocPhi(hocPhi);
		assertTrue(cd.getHocPhi() == hocPhi);
	}
	
	@Test
	public void getHocPhiTest() {
		System.out.println("getHocPhi");
		ChuyenDe cd = new ChuyenDe();
		double expected = 5555.2222;
		cd.setHocPhi(5555.2222);
		double result = cd.getHocPhi();
		assertTrue(result == expected);
	}

	@Test
	public void setThoiLuongTest() {
		System.out.println("setThoiLuong");
		int thoiLuong = 5;
		ChuyenDe cd = new ChuyenDe();
		cd.setThoiLuong(thoiLuong);
		assertTrue(cd.getThoiLuong() == thoiLuong);
	}
	
	@Test
	public void getThoiLuongTest() {
		System.out.println("getThoiLuong");
		ChuyenDe cd = new ChuyenDe();
		int expected = 5;
		cd.setThoiLuong(5);
		int result = cd.getThoiLuong();
		assertTrue(result == expected);
	}
	
	@Test
	public void setHinhTest() {
		System.out.println("setHinh");
		String hinh = "test.jpg";
		ChuyenDe cd = new ChuyenDe();
		cd.setHinh(hinh);
		assertEquals(cd.getHinh(), hinh);
	}
	
	@Test
	public void getHinhTest() {
		System.out.println("getHinh");
		ChuyenDe cd = new ChuyenDe();
		String expected = "test.jpg";
		cd.setMaCD("test.jpg");
		String result = cd.getMaCD();
		assertEquals(result, expected);
	}
	
	@Test
	public void setMoTaTest() {
		System.out.println("setMoTa");
		String moTa = "Test mô tả";
		ChuyenDe cd = new ChuyenDe();
		cd.setMoTa(moTa);
		assertEquals(cd.getMoTa(), moTa);
	}

	@Test
	public void getMoTaTest() {
		System.out.println("getMoTa");
		ChuyenDe cd = new ChuyenDe();
		String expected = "Test mô tả";
		cd.setMoTa("Test mô tả");
		String result = cd.getMoTa();
		assertEquals(result, expected);
	}
	
	@Test
	public void toStringTest() {
		System.out.println("toString");
		ChuyenDe cd = new ChuyenDe();
		String tenCD = "Test chuyên đề to String";
		cd.setTenCD(tenCD);
		assertEquals(tenCD, cd.toString());
//		System.out.println(cd.toString() + cd.getTenCD());
	}
	

	

	
}
