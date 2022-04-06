/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTruongChinh
 */
public class DesignHelper {
    
    public static void setBackgroundTrue(JTextField textField){
        textField.setBackground(new Color(51,255,0));
        textField.setBackground(new Color(0,0,0,0));
    }
    
    public static void setBackgroundTrue(JTextArea textArea){
        textArea.setBackground(new Color(51,255,0));
        textArea.setBackground(new Color(0,0,0,0));
    }
    
    public static void setBackgroundTrue(JPasswordField password){
        password.setBackground(new Color(51,255,0));
        password.setBackground(new Color(0,0,0,0));
    }
    
    public static void setBackgroundFalse(JTextField textField){
        textField.setBackground(new Color(255,51,0));
        textField.setForeground(new Color(255,255,255));
    }
    
    public static void setBackgroundFalse(JTextArea textArea){
        textArea.setBackground(new Color(255,51,0));
        textArea.setForeground(new Color(255,255,255));
    }
    
    public static void setBackgroundFalse(JPasswordField password){
        password.setBackground(new Color(255,51,0));
        password.setForeground(new Color(255,255,255));
    }
    
    public static void setBackgroundDefault(JTextField textField){
        textField.setBackground(new Color(255,255,255));
    }
    
    public static void setBackgroundDefault(JTextArea textArea){
        textArea.setBackground(new Color(255,255,255));
    }
    
    public static void setBackgroundDefault(JPasswordField password){
        password.setBackground(new Color(255,255,255));
    }
    
    public static void addTextField(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    
    public static void deleteTextField(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    public static void addTextArea(JTextArea textArea){
        Font font = textArea.getFont();
        font = font.deriveFont(Font.ITALIC);
        textArea.setFont(font);
        textArea.setForeground(Color.GRAY);
    }
    
    public static void deleteTextArea(JTextArea textArea){
        Font font = textArea.getFont();
        font = font.deriveFont(Font.PLAIN);
        textArea.setFont(font);
        textArea.setForeground(Color.BLACK);
    }
    
    public static void hoverEnter(JLabel label){
        Font font = label.getFont();
        label.setForeground(new Color(255,255,0));
        label.setFont(font);
    }
    
    public static void hoverExit(JLabel label){
        Font font = label.getFont();
        label.setForeground(new Color(0,0,255));
        label.setFont(font);
    }
    
    public static void setTable(JTable table){
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.getTableHeader().setBackground(new Color(255, 102, 0));
        table.getTableHeader().setForeground(Color.WHITE);
        table.setSelectionBackground(new Color(51, 102, 255));
        table.setSelectionForeground(new Color(255, 255, 255));
        table.setGridColor(new Color(255,255,255));
        table.setRowHeight(25);
    }
}
