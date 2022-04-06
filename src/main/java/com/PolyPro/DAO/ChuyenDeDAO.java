/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import com.PolyPro.entity.ChuyenDe;
import com.PolyPro.helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class ChuyenDeDAO extends PolyProDAO<ChuyenDe, String>{

    private String INSERT_SQL = "INSERT INTO CHUYENDE (MACD, TENCD, HOCPHI, THOILUONG, HINH, MOTA) VALUES (?,?,?,?,?,?)";
    private String UPDATE_SQL = "UPDATE CHUYENDE SET TENCD = ?, HOCPHI = ?, THOILUONG = ?, HINH = ?, MOTA = ? WHERE MACD = ?";
    private String DELETE_SQL = "DELETE FROM CHUYENDE WHERE MACD = ?";
    private String SELECT_ALL_SQL = "SELECT * FROM CHUYENDE";
    private String SELECT_BYID_SQL = "SELECT * FROM CHUYENDE WHERE MACD = ?";
    private String SELECT_IN = "SELECT * FROM CHUYENDE WHERE MACD IN (SELECT MACD FROM HOCVIEN WHERE MACD = ?)";
    
    @Override
    public void insert(ChuyenDe entity) {
        jdbcHelper.executeUpdate(INSERT_SQL, 
                entity.getMaCD(),
                entity.getTenCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getHinh(),
                entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        jdbcHelper.executeUpdate(UPDATE_SQL, 
                entity.getTenCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getHinh(),
                entity.getMoTa(),
                entity.getMaCD());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String ID) {
        List<ChuyenDe> list = this.selectBySql(SELECT_BYID_SQL, ID);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(rs.getString("MACD"));
                entity.setTenCD(rs.getString("TENCD"));
                entity.setHocPhi(rs.getDouble("HOCPHI"));
                entity.setThoiLuong(rs.getInt("THOILUONG"));
                entity.setHinh(rs.getString("HINH"));
                entity.setMoTa(rs.getString("MOTA"));
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<ChuyenDe> selectInCourse(String maCD){
        return this.selectBySql(SELECT_IN, maCD);
    }
    
    
    
}
