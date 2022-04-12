package com.PolyPro.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.PolyPro.entity.KhoaHoc;
import com.PolyPro.helper.DateHelper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KhoaHocDAOTest {

	private static KhoaHocDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new KhoaHocDAO();
	}

	@Test
	public void testASelectAll() {
		List<KhoaHoc> listKH = dao.selectAll();

		assertEquals(listKH.size(), 8);
	}

	@Test
	public void testBSelectById() {
		KhoaHoc kh = dao.selectById("1");
		
		assertNotNull(kh);
	}

	@Test
	public void testCInsertKhoaHoc() {
		List<KhoaHoc> listKH = dao.selectAll();
		KhoaHoc lastPositionKH = listKH.get(listKH.size() - 1);

		KhoaHoc kh = new KhoaHoc();
		kh.setMaCD("JAV01");
		kh.setHocPhi(333);
		kh.setThoiLuong(123);
		kh.setNgayKG(DateHelper.toDate("30/04/2022"));
		kh.setGhiChu("Khoá học test");
		kh.setMaNV("taint");

		dao.insert(kh);

		KhoaHoc insertedKH = dao.selectById(String.valueOf(lastPositionKH.getMaKH() + 1));

		assertNotNull(insertedKH);
	}

	@Test
	public void testDUpdateKhoaHoc() {
		KhoaHoc kh = dao.selectById("10");
		kh.setHocPhi(345);
		kh.setThoiLuong(121);

		dao.update(kh);

		KhoaHoc updatedKH = dao.selectById("10");

		assertTrue(kh.getHocPhi() == updatedKH.getHocPhi());
		assertEquals(kh.getThoiLuong(), updatedKH.getThoiLuong());
	}

	@Test
	public void testFDeleteString() {
		String id = "10";
		dao.delete(id);

		KhoaHoc deletedKH = dao.selectById(id);

		assertNull(deletedKH);
	}

	@Test
	public void testGSelectByChuyenDe() {
		String maCD = "JAV01";
		
		List<KhoaHoc> listCD = dao.selectByChuyenDe(maCD);
//		System.out.println(listCD.size());
		
		assertEquals(listCD.size(), 1);
	}
	
}
