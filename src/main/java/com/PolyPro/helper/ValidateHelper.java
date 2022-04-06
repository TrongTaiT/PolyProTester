/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;

import com.PolyPro.DAO.NhanVienDAO;
import com.PolyPro.frame.NhanVienJFrame;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.TextField;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTruongChinh
 */
public class ValidateHelper {

    public static String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa đạt";
        }
        if (diem < 6.5) {
            return "Trung bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public static boolean checkNull(JTextField textField) {
        if (textField.getText().trim().length() == 0) {
            DialogHelper.alert(null, "Vui lòng nhập đầy đủ thông tin");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkMaNV(JTextField textField) {
        String id = textField.getText();
        String regex = "[a-zA-Z0-9]{4,11}";
        if (id.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkMaCD(JTextField textField) {
        String id = textField.getText();
        String regex = "[a-zA-Z0-9]{1,5}";
        if (id.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkMaNH(JTextField textField) {
        String id = textField.getText();
        String regex = "[a-zA-Z0-9]{1,7}";
        if (id.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkPass(JPasswordField passwordField) {
        String pass = passwordField.getText();
        String regex = "[a-zA-Z0-9]{7,}";
        if (pass.matches(regex)) {
            passwordField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            passwordField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkName(JTextField textField) {
        String name = textField.getText();
        String regex = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,30}$";
        if (name.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkNameForm(JTextField textField) {
        String name = textField.getText();
        String regex = ".{3,50}";
        if (name.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkTime(JTextField textField) {
        try {
            int time = Integer.parseInt(textField.getText());
            if (time >= 0) {
                textField.setBackground(new Color(51, 255, 0));
                return true;
            } else {
                textField.setBackground(new Color(255, 51, 0));
                return false;
            }
        } catch (Exception e) {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkHocPhi(JTextField textField) {
        try {
            float tuition = Float.parseFloat(textField.getText());
            if (tuition >= 0) {
                textField.setBackground(new Color(51, 255, 0));
                return true;
            } else {
                textField.setBackground(new Color(255, 51, 0));
                return false;
            }
        } catch (Exception e) {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkDate(JTextField textField) {
        String date = textField.getText();
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        if (date.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkPhone(JTextField textField) {
        try {
            int phone = Integer.parseInt(textField.getText());
            if (phone >= 0) {
                textField.setBackground(new Color(51, 255, 0));
                return true;
            } else {
                textField.setBackground(new Color(255, 51, 0));
                return false;
            }
        } catch (Exception e) {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkMail(JTextField textField) {
        String email = textField.getText();
        String regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        if (email.matches(regex)) {
            textField.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textField.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

    public static boolean checkNote(JTextArea textArea) {
        String name = textArea.getText();
        String regex = ".{3,255}";
        if (name.matches(regex)) {
            textArea.setBackground(new Color(51, 255, 0));
            return true;
        } else {
            textArea.setBackground(new Color(255, 51, 0));
            return false;
        }
    }

}
