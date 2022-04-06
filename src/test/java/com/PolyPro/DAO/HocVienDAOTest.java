package com.PolyPro.DAO;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.PolyPro.entity.HocVien;

public class HocVienDAOTest {

	private static HocVienDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new HocVienDAO();
	}

	@Test
	public void testSelectAll() {
		List<HocVien> listHV = dao.selectAll();

		assertTrue(listHV.size() > 0);
	}

	@Test
	public void testSelectById() {
		HocVien newHV = dao.selectById("1");

		assertNotNull(newHV);
	}

	// Không phù hợp nếu vị trí cuối vừa bị xoá
	@Test
	public void testInsertHocVien() {
		List<HocVien> listHV = dao.selectAll();
		HocVien lastPositionHV = listHV.get(listHV.size() - 1);

		HocVien newHV = new HocVien();
		newHV.setMaKH(2);
		newHV.setMaNH("PS03561");
		newHV.setDiem(10);

		dao.insert(newHV);

		HocVien insertedHV = dao.selectById(String.valueOf(lastPositionHV.getMaHV() + 1));

		assertNotNull(insertedHV);
	}

	@Test
	public void testSelectByMaKH_MaNH() {
		HocVien hv = dao.selectByMaKH_MaNH(2, "PS03561");

		assertNotNull(hv);
	}

	@Test
	public void testUpdateHocVien() {
		HocVien hv = dao.selectByMaKH_MaNH(2, "PS03561");
		hv.setDiem(0);

		dao.update(hv);

		HocVien updatedHV = dao.selectByMaKH_MaNH(2, "PS03561");

		assertTrue(updatedHV.getDiem() == 0);
	}

	@Test
	public void testDeleteString() {
		String id = "46";
		
		dao.delete(id);
		
		HocVien hv = dao.selectById(id);

		assertNull(hv);
	}

}
