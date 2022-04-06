/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import com.PolyPro.entity.HocVien;
import com.PolyPro.helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class HocVienDAO extends PolyProDAO<HocVien, String> {

	String INSERT_SQL = "INSERT INTO HOCVIEN (DIEM, MAKH, MANH) VALUES (?,?,?)";
	String UPDATE_SQL = "UPDATE HOCVIEN SET DIEM = ?, MAKH = ?, MANH = ? WHERE MAHV = ?";
	String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MAHV = ?";
	String SELECT_ALL_SQL = "SELECT * FROM HOCVIEN";
	String SELECT_BYID_SQL = "SELECT * FROM HOCVIEN WHERE MAHV = ?";
	String SELECT_BY_KHOAHOC = "SELECT * FROM HOCVIEN WHERE MAKH = ?";

	@Override
	public void insert(HocVien entity) {
		jdbcHelper.executeUpdate(INSERT_SQL, entity.getDiem(), entity.getMaKH(), entity.getMaNH());
	}

	@Override
	public void update(HocVien entity) {
		jdbcHelper.executeUpdate(UPDATE_SQL, entity.getDiem(), entity.getMaKH(), entity.getMaNH(), entity.getMaHV());
	}

	@Override
	public void delete(String id) {
		jdbcHelper.executeUpdate(DELETE_SQL, id);
	}

	@Override
	public List<HocVien> selectAll() {
		return this.selectBySql(SELECT_ALL_SQL);
	}

	@Override
	public HocVien selectById(String id) {
		List<HocVien> list = this.selectBySql(SELECT_BYID_SQL, id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	protected List<HocVien> selectBySql(String sql, Object... args) {
		List<HocVien> list = new ArrayList<HocVien>();
		try {
			ResultSet rs = jdbcHelper.executeQuery(sql, args);
			while (rs.next()) {
				HocVien entity = new HocVien();
				entity.setMaHV(rs.getInt("MAHV"));
				entity.setDiem(rs.getDouble("DIEM"));
				entity.setMaKH(rs.getInt("MAKH"));
				entity.setMaNH(rs.getString("MANH"));

				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<HocVien> selectByKhoaHoc(int maKH) {
		return this.selectBySql(SELECT_BY_KHOAHOC, maKH);
	}

	public HocVien selectByMaKH_MaNH(int maKH, String maNH) {
		String sql = "SELECT*FROM HOCVIEN WHERE MAKH = ? AND MANH= ? ";
		List<HocVien> list = this.selectBySql(sql, maKH, maNH);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}
