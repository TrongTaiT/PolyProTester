/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author NguyenTruongChinh
 */
public class DialogHelper {
    
    /* thông báo 
        parent là cửa sổ
        message là text
    */
    
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message,
                "Hệ thống quản lý đào tạo",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    /* thông báo và xác nhận 
        parent là cửa sổ
        message là text
        return là kết quả của người dùng chọn YES-NO
    */
    
    public static boolean confirm(Component parent, String message){
        int choose = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý đào tạo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return choose == JOptionPane.YES_OPTION;
    }
    
    /* thông báo và yêu cầu 
        parent là cửa sổ
        message là text
        return về kết quả của người nhập
    */
    
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống quản lý đào tạo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
