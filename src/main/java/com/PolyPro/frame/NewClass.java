/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.frame;

import com.PolyPro.DAO.NguoiHocDAO;
import com.PolyPro.entity.NguoiHoc;
import com.PolyPro.helper.DialogHelper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class NewClass {
    static void sendMail() {
        NguoiHoc nh = new NguoiHoc();
        NguoiHocDAO nhdao = new NguoiHocDAO();
        List<NguoiHoc> list = nhdao.selectAll();
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        sendMail();
    }
    
    
}
