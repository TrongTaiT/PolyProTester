package com.PolyPro.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

import com.PolyPro.entity.ChuyenDe;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChuyenDeDAOTest {

	static ChuyenDeDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new ChuyenDeDAO();
	}

	@Test
	public void testAselectById() {
		String id = "JAV01";
		ChuyenDe searchCD = dao.selectById(id);
		
		assertNotNull(searchCD);
	}

	@Test
	public void testBinsertChuyenDe() {
		ChuyenDe newCD = new ChuyenDe();
		newCD.setMaCD("CĐtét");
		newCD.setTenCD("Chuyên đề test");
		newCD.setHocPhi(3000000);
		newCD.setThoiLuong(99);
		newCD.setHinh("path test");
		newCD.setMoTa("Test thêm chuyên đề");

		dao.insert(newCD);

		ChuyenDe insertedCD = dao.selectById("CĐtét");

		assertTrue(insertedCD.equals(newCD));
	}

	@Test
	public void testCupdateChuyenDe() {
		ChuyenDe updateCD = dao.selectById("CĐtét");
		updateCD.setTenCD("Chuyên đề sửa");
		updateCD.setHocPhi(2000000);
		updateCD.setThoiLuong(150);

		dao.update(updateCD);

		ChuyenDe updatedCD = dao.selectById("CĐtét");

		assertEquals(updateCD.getTenCD(), updatedCD.getTenCD());
		assertTrue(updateCD.getHocPhi() == updatedCD.getHocPhi());
		assertEquals(updateCD.getThoiLuong(), updatedCD.getThoiLuong());
	}

	@Test
	public void testDdeleteString() {
		String id = "CĐtét";
		dao.delete(id);

		ChuyenDe deletedCD = dao.selectById(id);

		assertNull(deletedCD);
	}

	@Test
	public void testEselectAll() {
		List<ChuyenDe> listCD = dao.selectAll();
		
		assertEquals(listCD.size(), 21);
	}

}
