/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.helper;

import com.PolyPro.entity.NhanVien;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author NguyenTruongChinh
 */
public class ShareHelper {
    
    /* logo */
//    public static final Image APP_ICON;
//    static{
//        // load logo
//        String file = "com.Polypro/icons/fpt.png";
//        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
//    }
    public static Image getAppIcon(){
        URL url = ShareHelper.class.getResource("/com/PolyPro/icons/fpt.png");
        return new ImageIcon(url).getImage();
    }
    
    public static void saveLogo(File src){
        File dst = new File("logos", src.getName());
        // Táº¡o folder má»›i náº¿u chÆ°a cÃ³
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
        /* Ä‘á»�c hÃ¬nh áº£nh logo chuyÃªn Ä‘á»� */
    public static ImageIcon readLogo(String fileName){
        File path = new File("logos", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(185, 240, Image.SCALE_DEFAULT));
    }
    
    public static ImageIcon defaultImage(String fileName){
        File path = new File(fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(185, 240, Image.SCALE_DEFAULT));
    }
    
        /* Ä‘á»‘i tÆ°á»£ng chá»©a thÃ´ng tin sau khi Ä‘Äƒng nháº­p */
    public static NhanVien user = null;
    
        /* xÃ³a thÃ´ng tin khi Ä‘Äƒng xuáº¥t */
    public static void clear(){
        ShareHelper.user = null;
    }
    
    public static boolean isLogin(){
        return ShareHelper.user != null;
    }
    
    public static boolean isMangager(){
        return ShareHelper.isLogin() && user.isVaiTro();
    }
    
}
