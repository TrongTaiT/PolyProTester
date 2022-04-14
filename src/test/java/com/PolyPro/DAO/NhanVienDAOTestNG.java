package com.PolyPro.DAO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PolyPro.entity.NhanVien;

public class NhanVienDAOTestNG {

	private NhanVienDAO dao;
	
	@BeforeClass
	public void setUpBeforeClass() {
		dao = new NhanVienDAO();
	}

	@Test(priority = 1)
	public void insertTest() {
		NhanVien nv = new NhanVien();
		nv.setMaNV("TestNV");
		nv.setHoTen("Tên NV Test");
		nv.setMatKhau("mdktkskgkm1");
		nv.setVaiTro(true);
		
		dao.insert(nv);
		
		NhanVien inserted = dao.selectById("TestNV");
		assertEquals(nv.getMaNV(), inserted.getMaNV());
	}
	
	@Test(priority = 2)
	public void selectByIdTest() {
		String id = "TestNV";
		NhanVien searchNV = dao.selectById(id);
		assertNotNull(searchNV);
	}
	
	@Test(priority = 3)
	public void updateTest() {
		NhanVien nv = dao.selectById("TestNV");
		nv.setHoTen("Sửa nhân viên test");
		nv.setMatKhau("123456");
		
		dao.update(nv);
		
		NhanVien updated = dao.selectById("TestNV");
		
		assertEquals(nv.getHoTen(), updated.getHoTen());
		assertEquals(nv.getMatKhau(), updated.getMatKhau());
	}
	
	@Test(priority = 4)
	public void resetPasswordTest() {
		NhanVien updatePassword = dao.selectById("TestNV");
		updatePassword.setMatKhau("456789");
		dao.update(updatePassword);
		
		NhanVien updateddPW = dao.selectById("TestNV");
		
		assertEquals(updatePassword.getMatKhau(), updateddPW.getMatKhau());
	}

	@Test(priority = 5)
	public void deleteTest() {
		String id = "TestNV";
		dao.delete(id);
		
		NhanVien deleted = dao.selectById("TestNV");
		assertNull(deleted);
	}

	@Test(enabled = false)
	public void selectAllTest() {
		throw new RuntimeException("Test not implemented");
	}
	
	@Test(enabled = false)
	public void selectBySqlTest() {
		throw new RuntimeException("Test not implemented");
	}
	
	@AfterTest
	public void setUpAfterClass() {
		
	}
}
