/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import com.PolyPro.entity.NhanVien;
import com.PolyPro.helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class NhanVienDAO extends PolyProDAO<NhanVien, String>{

    @Override
    public void insert(NhanVien entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "INSERT INTO NHANVIEN (MANV, MATKHAU, HOTEN, VAITRO) VALUES (?,?,?,?)";
        jdbcHelper.executeUpdate(sql,
                entity.getMaNV(), 
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "UPDATE NHANVIEN SET MATKHAU = ?, HOTEN = ?, VAITRO = ? WHERE MANV = ?";
        jdbcHelper.executeUpdate(sql, 
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.isVaiTro(),
                entity.getMaNV());
    }
    
    public void resetPassword(NhanVien entity){
        String sql = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANV = ?";
        jdbcHelper.executeUpdate(sql, 
                entity.getMatKhau(),
                entity.getMaNV());
    }

    @Override
    public void delete(String maNV) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
        jdbcHelper.executeUpdate(sql, maNV);
    }

    @Override
    public List<NhanVien> selectAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM NHANVIEN";
        return this.selectBySql(sql);
    }

    @Override
    public NhanVien selectById(String id) {
        String sql = "SELECT * FROM NHANVIEN WHERE MANV = ?";
        List<NhanVien> list = this.selectBySql(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MANV"));
                entity.setMatKhau(rs.getString("MATKHAU"));
                entity.setHoTen(rs.getString("HOTEN"));
                entity.setVaiTro(rs.getBoolean("VAITRO"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
