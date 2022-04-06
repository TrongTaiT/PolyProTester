package com.PolyPro.DAO;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.PolyPro.entity.KhoaHoc;

public class KhoaHocDAOTest {
	
	private static KhoaHocDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new KhoaHocDAO();
	}

	@Test
	public void testInsertKhoaHoc() {
		KhoaHoc kh = new KhoaHoc();
	}

	@Test
	public void testUpdateKhoaHoc() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByChuyenDe() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectBySqlStringObjectArray() {
		fail("Not yet implemented");
	}

}
