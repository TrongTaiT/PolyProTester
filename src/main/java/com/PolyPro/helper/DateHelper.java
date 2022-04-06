/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NguyenTruongChinh
 */
public class DateHelper {
    
    static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date now(){
        return new Date();
    }
    
    public static Date toDate(String date, String pattern){
        try {
            fmt.applyPattern(pattern);
            return fmt.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static String toString(Date date, String pattern){
        fmt.applyPattern(pattern);
        return fmt.format(date);
    }
    
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
    
}
