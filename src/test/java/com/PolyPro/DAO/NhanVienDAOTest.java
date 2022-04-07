package com.PolyPro.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.PolyPro.entity.NhanVien;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NhanVienDAOTest {
	
	static NhanVienDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new NhanVienDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void testAselectByIdString() {
		String id = "TeoNV";
		NhanVien searchNV = dao.selectById(id);
		assertNotNull(searchNV);
	}

	@Test
	public void testBinsertNhanVien() {
		NhanVien newNV = new NhanVien();
		newNV.setMaNV("NVTest");
		newNV.setHoTen("Test Nhân Viên");
		newNV.setMatKhau("abcxyz");
		newNV.setVaiTro(true);
		
		dao.insert(newNV);
		
		NhanVien createdNV = dao.selectById("NVTest");
		assertEquals(newNV.getMaNV(), createdNV.getMaNV());
	}

	@Test
	public void testCupdateNhanVien() {
		NhanVien updateNV = dao.selectById("NVTest");
		updateNV.setHoTen("Sửa nhân viên test");
		updateNV.setMatKhau("123456");
		
		dao.update(updateNV);
		
		NhanVien updatedNV = dao.selectById("NVTest");
		
		assertEquals(updateNV.getHoTen(), updatedNV.getHoTen());
		assertEquals(updateNV.getMatKhau(), updatedNV.getMatKhau());
	}

	@Test
	public void testDresetPassword() {
		NhanVien updatePassword = dao.selectById("NVTest");
		updatePassword.setMatKhau("456789");
		dao.update(updatePassword);
		
		NhanVien updateddPW = dao.selectById("NVTest");
		
		assertEquals(updatePassword.getMatKhau(), updateddPW.getMatKhau());
	}

	@Test
	public void testEdeleteString() {
		String id = "NVTest";
		dao.delete(id);
		
		NhanVien deletedNV = dao.selectById("NVTest");
		
		assertNull(deletedNV);
	}

	@Test
	public void testFselectAll() {
		List<NhanVien> listNV = dao.selectAll();
		
		assertEquals(listNV.size(), 7);
	}

	@Test
	public void testSelectBySqlStringObjectArray() {
		fail("Not yet implemented");
	}

}
