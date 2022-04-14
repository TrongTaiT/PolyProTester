package com.PolyPro.DAO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PolyPro.entity.ChuyenDe;

public class ChuyenDeDAOTestNG {
	
	private ChuyenDeDAO dao;
	@BeforeClass
	public void beforeClass() {
		dao = new ChuyenDeDAO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 4)
	public void deleteTest() {
		String id = "CDTét";
		dao.delete(id);
		
		ChuyenDe deleted = dao.selectById("CDTét");
		assertNull(deleted);
	}

	@Test(priority = 1)
	public void insertTest() {
		ChuyenDe cd = new ChuyenDe();
		cd.setMaCD("CDTét");
		cd.setTenCD("Tên chuyên đề Test");
		cd.setHocPhi(5000.025);
		cd.setThoiLuong(60);
		cd.setHinh("path");
		cd.setMoTa("Mô tả test");
		
		dao.insert(cd);
		
		ChuyenDe inserted = dao.selectById("CDTét");
		assertNotNull(inserted);
	}

	@Test(enabled = false)
	public void selectAllTest() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(priority = 2)
	public void selectByIdTest() {
		String id = "CDTét";
		ChuyenDe searchCD = dao.selectById(id);
		assertNotNull(searchCD);
	}

	@Test(enabled = false)
	public void selectBySqlTest() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void selectInCourseTest() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(priority = 3)
	public void updateTest() {
		ChuyenDe cd = dao.selectById("CDTét");
		cd.setTenCD("Tên chuyên đề sửa");
		cd.setHocPhi(8000000.00);
		cd.setThoiLuong(70);
		cd.setHinh("path sửa");
		cd.setMoTa("mô tả sửa");
		
		dao.update(cd);
		
		ChuyenDe updated = dao.selectById("CDTét");
		assertEquals(cd, updated);
	}
}
