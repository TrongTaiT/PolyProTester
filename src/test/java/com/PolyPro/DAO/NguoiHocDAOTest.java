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

import com.PolyPro.entity.NguoiHoc;
import com.PolyPro.helper.DateHelper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NguoiHocDAOTest {

	private static NguoiHocDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new NguoiHocDAO();
	}

	@Test
	public void testASelectById() {
		NguoiHoc newNH = dao.selectById("PS03674");

		assertNotNull(newNH);
	}

	@Test
	public void testBInsertNguoiHoc() {
		NguoiHoc newNH = new NguoiHoc();
		newNH.setMaNH("PS00001");
		newNH.setHoTen("Nguyễn Văn Test");
		newNH.setNgaySinh(DateHelper.toDate("28/07/1999"));
		newNH.setGioiTinh(true);
		newNH.setDienThoai("0902993991");
		newNH.setEmail("PS00001@gmail.com");
		newNH.setGhiChu("Tester tương lei");
		newNH.setMaNV("taint");

		dao.insert(newNH);

		NguoiHoc insertedNH = dao.selectById("PS00001");

		assertTrue(insertedNH.equals(newNH));
	}

	@Test
	public void testCUpdateNguoiHoc() {
		NguoiHoc nh = dao.selectById("PS00001");
		nh.setHoTen("Trần Văn Tester");
		nh.setGioiTinh(true);
		
		dao.update(nh);
		
		NguoiHoc updatedNH = dao.selectById("PS00001");

		assertEquals(nh.getHoTen(), updatedNH.getHoTen());
		assertEquals(nh.isGioiTinh(), updatedNH.isGioiTinh());
	}

	@Test
	public void testDDeleteString() {
		String id = "PS00001";
		
		dao.delete(id);

		NguoiHoc deletedNH = dao.selectById("PS00001");
		
		assertNull(deletedNH);
	}

	@Test
	public void testESelectAll() {
		List<NguoiHoc> listNH = dao.selectAll();
		
		assertEquals(listNH.size(), 50);
	}

	@Test
	public void testFSelectByKeyword() {
		String keyword = "Nguyễn";

		List<NguoiHoc> listNH = dao.selectByKeyword(keyword);
		
		assertTrue(listNH.size() > 0);
	}

}
