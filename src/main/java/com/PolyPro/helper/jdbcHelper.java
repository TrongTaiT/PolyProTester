/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;
import java.sql.*;

/**
 *
 * @author NguyenTruongChinh
 */
public class jdbcHelper {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433; databaseName = PolyPro";
    static String user = "sa";
    static String password = "songlong";
    
    // Náº¡p driver
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement prepareStatement(String sql, Object...args) throws SQLException{
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps;
        if(sql.trim().startsWith("{")){
            ps = con.prepareCall(sql);
        }
        else{
            ps = con.prepareStatement(sql);
        }
        for(int i = 0; i < args.length; i++){
            ps.setObject(i+1, args[i]);
        }
        return ps;
    }
    
    // CÃ�C THAO TÃ�C INSERT, UPDATE, DELETE
    
    public static int executeUpdate(String sql, Object...args){
        try {
            PreparedStatement ps = jdbcHelper.prepareStatement(sql, args);
            try {
                return ps.executeUpdate();
            } 
            finally{
                ps.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /* 
        * Thá»±c hiá»‡n cÃ¢u lá»‡nh SQL truy váº¥n SELECT
        * Thá»±c thi Pre Ä‘Ã£ truyá»�n tham sá»‘ á»Ÿ trÃªn
        * sql lÃ  cÃ¢u lá»‡nh SQL Statement cÃ³ thá»ƒ cÃ³ Ä‘á»‘i sá»‘
        * args lÃ  list Ä‘á»‘i sá»‘ cá»§a cÃ¢u lá»‡nh sql
    */
    
    public static ResultSet executeQuery(String sql, Object...args) throws SQLException{
        PreparedStatement ps = jdbcHelper.prepareStatement(sql, args);
        return ps.executeQuery();
    }
    
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
