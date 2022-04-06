/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.DAO;

import com.PolyPro.helper.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class ThongKeDAO {
    
    private List<Object[]>getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i = 0; i < cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getNguoiHoc(){
        String sql = "{CALL SP_THONGKENGUOIHOC}";
        String [] cols = {"NAM", "SOLUONG", "DAUTIEN", "CUOICUNG"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getBangDiem(int maKH){
        String sql = "{CALL SP_BANGDIEM(?)}";
        String [] cols = {"MANH", "HOTEN", "DIEM"};
        return this.getListOfArray(sql, cols, maKH);
    }
    
    public List<Object[]> getDiemChuyenDe(){
        String sql = "{CALL SP_DIEMCHUYENDE}";
        String [] cols = {"CHUYENDE", "SOHV", "CAONHAT", "THAPNHAT", "TRUNGBINH"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(int year){
        String sql = "{CALL SP_THONGKEDOANHTHU(?)}";
        String [] cols = {"CHUYENDE", "SOKH", "SOHV", "DOANHTHU", "THAPNHAT", "CAONHAT", "TRUNGBINH"};
        return this.getListOfArray(sql, cols, year);
    }
}
