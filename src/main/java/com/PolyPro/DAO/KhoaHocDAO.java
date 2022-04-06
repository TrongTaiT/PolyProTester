/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import com.PolyPro.entity.KhoaHoc;
import com.PolyPro.helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class KhoaHocDAO extends PolyProDAO<KhoaHoc, String>{

    String INSERT_SQL = "INSERT INTO KHOAHOC (HOCPHI, THOILUONG, NGAYKG, GHICHU, NGAYTAO, MANV, MACD) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KHOAHOC SET HOCPHI = ?, THOILUONG = ?, NGAYKG = ?, GHICHU = ?, MANV = ?, MACD = ? WHERE MAKH = ?";
    String DELETE_SQL = "DELETE FROM KHOAHOC WHERE MAKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KHOAHOC";
    String SELECT_BYID_SQL = "SELECT * FROM KHOAHOC WHERE MAKH = ?";
    String SELECT_BYCHUYENDE_SQL = "SELECT * FROM KHOAHOC WHERE MACD = ?";
    String SELECT_DISTINCT = "SELECT DISTINCT YEAR(NGAYKG) YEAR FROM KHOAHOC ORDER BY YEAR DESC";
    
    @Override
    public void insert(KhoaHoc entity) {
        jdbcHelper.executeUpdate(INSERT_SQL, 
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getNgayTao(),
                entity.getMaNV(),
                entity.getMaCD());
    }

    @Override
    public void update(KhoaHoc entity) {
        jdbcHelper.executeUpdate(UPDATE_SQL, 
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getMaNV(),
                entity.getMaCD(),
                entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectById(String id) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BYID_SQL, Integer.parseInt(id));
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public List<KhoaHoc> selectByChuyenDe(String maCD){
        return this.selectBySql(SELECT_BYCHUYENDE_SQL, maCD);
    }
    
    public List<Integer> selectYear(){
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.executeQuery(SELECT_DISTINCT);
            while(rs.next()){
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try {
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MAKH"));
                entity.setHocPhi(rs.getDouble("HOCPHI"));
                entity.setThoiLuong(rs.getInt("THOILUONG"));
                entity.setNgayKG(rs.getDate("NGAYKG"));
                entity.setGhiChu(rs.getString("GHICHU"));
                entity.setNgayTao(rs.getDate("NGAYTAO"));
                entity.setMaNV(rs.getString("MANV"));
                entity.setMaCD(rs.getString("MACD"));
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
