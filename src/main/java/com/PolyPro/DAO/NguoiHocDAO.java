/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.PolyPro.entity.NguoiHoc;
import com.PolyPro.helper.jdbcHelper;

/**
 *
 * @author NguyenTruongChinh
 */
public class NguoiHocDAO extends PolyProDAO<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH, HOTEN, NGAYSINH, GIOITINH, DIENTHOAI, EMAIL, "
            + "GHICHU, MANV, NGAYDK)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HOTEN = ?, NGAYSINH = ?, GIOITINH = ?, DIENTHOAI = ?, EMAIL = ?, "
            + "GHICHU = ?, MANV = ?  WHERE MANH=?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NGUOIHOC ";
    String SELECT_BY_ID_SQL = "SELECT *from NGUOIHOC WHERE MANH=?";
    String SELECT_BY_KEYWORD = "SELECT * FROM NGUOIHOC WHERE HOTEN LIKE ?";
    String SELECT_NOTIN = "SELECT * FROM NGUOIHOC WHERE HOTEN LIKE ? AND MANH NOT IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
    String SELECT_IN = "SELECT * FROM NGUOIHOC WHERE MANH IN (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
    
    @Override
    public void insert(NguoiHoc entity) {
        jdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaNH(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.isGioiTinh(), entity.getDienThoai(),
                entity.getEmail(), entity.getGhiChu(),
                entity.getMaNV(),
                entity.getNgayDK());
        System.out.println(entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        jdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.isGioiTinh(),
                entity.getDienThoai(),
                entity.getEmail(),
                entity.getGhiChu(),
                entity.getMaNV(),
                entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String key) {
        List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MANH"));
                entity.setHoTen(rs.getString("HOTEN"));
                entity.setNgaySinh(rs.getDate("NGAYSINH"));
                entity.setGioiTinh(rs.getBoolean("GIOITINH"));
                entity.setDienThoai(rs.getString("DIENTHOAI"));
                entity.setEmail(rs.getString("EMAIL"));
                entity.setGhiChu(rs.getString("GHICHU"));
                entity.setMaNV(rs.getString("MANV"));
                entity.setNgayDK(rs.getDate("NGAYDK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        return this.selectBySql(SELECT_BY_KEYWORD, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectNotInCourse(int maKH, String keyword) {
        return this.selectBySql(SELECT_NOTIN, "%" + keyword + "%", maKH);
    }
    
    public List<NguoiHoc> selectInCourse(int maKH){
        return this.selectBySql(SELECT_IN, maKH);
    }

}
