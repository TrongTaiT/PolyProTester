/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.frame;

import com.PolyPro.helper.DialogHelper;
import com.PolyPro.helper.ShareHelper;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

/**
 *
 * @author NguyenTruongChinh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        toolBar = new javax.swing.JToolBar();
        btn_logout = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btn_thematic = new javax.swing.JButton();
        btn_learner = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        btn_hocVien = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btn_help = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_status = new javax.swing.JLabel();
        lbl_clock = new javax.swing.JLabel();
        panel = new com.k33ptoo.components.KGradientPanel();
        lbl_content = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_system = new javax.swing.JMenu();
        mni_login = new javax.swing.JMenuItem();
        mni_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mni_changePassword = new javax.swing.JMenuItem();
        mni_forgotPass = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mni_stop = new javax.swing.JMenuItem();
        mnu_manage = new javax.swing.JMenu();
        mni_learner = new javax.swing.JMenuItem();
        mni_thematic = new javax.swing.JMenuItem();
        mni_course = new javax.swing.JMenuItem();
        mni_employeeManage = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnu_statistical = new javax.swing.JMenu();
        mni_learnersEveryYear = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mni_scoreboard = new javax.swing.JMenuItem();
        mni_pointForEachCourse = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mni_revenue = new javax.swing.JMenuItem();
        mnu_help = new javax.swing.JMenu();
        mni_instruct = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mni_introduce = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        toolBar.setRollover(true);

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Exit.png"))); // NOI18N
        btn_logout.setText("Đăng xuất");
        btn_logout.setFocusable(false);
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        toolBar.add(btn_logout);

        btn_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Stop.png"))); // NOI18N
        btn_stop.setText("Kết thúc");
        btn_stop.setFocusable(false);
        btn_stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_stop.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });
        toolBar.add(btn_stop);
        toolBar.add(jSeparator6);

        btn_thematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Lists.png"))); // NOI18N
        btn_thematic.setText("Chuyên đề");
        btn_thematic.setFocusable(false);
        btn_thematic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_thematic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_thematic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_thematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thematicActionPerformed(evt);
            }
        });
        toolBar.add(btn_thematic);

        btn_learner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Conference.png"))); // NOI18N
        btn_learner.setText("Người học");
        btn_learner.setFocusable(false);
        btn_learner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_learner.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_learner.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_learner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_learnerActionPerformed(evt);
            }
        });
        toolBar.add(btn_learner);

        btn_course.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Certificate.png"))); // NOI18N
        btn_course.setText("Khóa học");
        btn_course.setFocusable(false);
        btn_course.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_course.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_course.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_courseActionPerformed(evt);
            }
        });
        toolBar.add(btn_course);

        btn_hocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Clien list.png"))); // NOI18N
        btn_hocVien.setText("Học viên");
        btn_hocVien.setFocusable(false);
        btn_hocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hocVien.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_hocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_hocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hocVienActionPerformed(evt);
            }
        });
        toolBar.add(btn_hocVien);
        toolBar.add(jSeparator7);

        btn_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Globe.png"))); // NOI18N
        btn_help.setText("Hướng dẫn");
        btn_help.setFocusable(false);
        btn_help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_help.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btn_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });
        toolBar.add(btn_help);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lbl_status.setForeground(new java.awt.Color(255, 255, 255));
        lbl_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Info.png"))); // NOI18N
        lbl_status.setText("Hệ quản lý đào tạo");
        jPanel1.add(lbl_status, java.awt.BorderLayout.CENTER);

        lbl_clock.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        lbl_clock.setForeground(new java.awt.Color(255, 255, 255));
        lbl_clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Alarm.png"))); // NOI18N
        lbl_clock.setText("10:55 PM  ");
        jPanel1.add(lbl_clock, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        panel.setkBorderRadius(0);
        panel.setkEndColor(new java.awt.Color(51, 255, 51));
        panel.setkGradientFocus(1100);
        panel.setkStartColor(new java.awt.Color(51, 51, 255));
        panel.setLayout(new java.awt.BorderLayout());

        lbl_content.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_content.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/logo.png"))); // NOI18N
        panel.add(lbl_content, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        mnu_system.setText("Hệ thống");
        mnu_system.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mnu_system.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_systemActionPerformed(evt);
            }
        });

        mni_login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mni_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Key.png"))); // NOI18N
        mni_login.setText("Đăng nhập");
        mni_login.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_loginActionPerformed(evt);
            }
        });
        mnu_system.add(mni_login);

        mni_logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mni_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Log out.png"))); // NOI18N
        mni_logout.setText("Đăng xuất");
        mni_logout.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_logoutActionPerformed(evt);
            }
        });
        mnu_system.add(mni_logout);
        mnu_system.add(jSeparator1);

        mni_changePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Refresh.png"))); // NOI18N
        mni_changePassword.setText("Đổi mật khẩu");
        mni_changePassword.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_changePasswordActionPerformed(evt);
            }
        });
        mnu_system.add(mni_changePassword);

        mni_forgotPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Mail-Password-icon.png"))); // NOI18N
        mni_forgotPass.setText("Quên mật khẩu");
        mni_forgotPass.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_forgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_forgotPassActionPerformed(evt);
            }
        });
        mnu_system.add(mni_forgotPass);
        mnu_system.add(jSeparator2);

        mni_stop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mni_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Stop.png"))); // NOI18N
        mni_stop.setText("Kết thúc");
        mni_stop.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_stopActionPerformed(evt);
            }
        });
        mnu_system.add(mni_stop);

        jMenuBar1.add(mnu_system);

        mnu_manage.setText("Quản lý");
        mnu_manage.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mni_learner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Conference.png"))); // NOI18N
        mni_learner.setText("Người học");
        mni_learner.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_learner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_learnerActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_learner);

        mni_thematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Lists.png"))); // NOI18N
        mni_thematic.setText("Chuyên đề");
        mni_thematic.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_thematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_thematicActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_thematic);

        mni_course.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Certificate.png"))); // NOI18N
        mni_course.setText("Khóa học");
        mni_course.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_courseActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_course);

        mni_employeeManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/User group.png"))); // NOI18N
        mni_employeeManage.setText("Quản lý nhân viên");
        mni_employeeManage.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_employeeManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_employeeManageActionPerformed(evt);
            }
        });
        mnu_manage.add(mni_employeeManage);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Clien list.png"))); // NOI18N
        jMenuItem1.setText("Học viên");
        jMenuItem1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnu_manage.add(jMenuItem1);

        jMenuBar1.add(mnu_manage);

        mnu_statistical.setText("Thống kê");
        mnu_statistical.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mni_learnersEveryYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Clien list.png"))); // NOI18N
        mni_learnersEveryYear.setText("Người học từng năm");
        mni_learnersEveryYear.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_learnersEveryYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_learnersEveryYearActionPerformed(evt);
            }
        });
        mnu_statistical.add(mni_learnersEveryYear);
        mnu_statistical.add(jSeparator3);

        mni_scoreboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Card file.png"))); // NOI18N
        mni_scoreboard.setText("Bảng điểm khóa...");
        mni_scoreboard.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_scoreboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_scoreboardActionPerformed(evt);
            }
        });
        mnu_statistical.add(mni_scoreboard);

        mni_pointForEachCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Bar chart.png"))); // NOI18N
        mni_pointForEachCourse.setText("Điểm từng khóa học");
        mni_pointForEachCourse.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_pointForEachCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_pointForEachCourseActionPerformed(evt);
            }
        });
        mnu_statistical.add(mni_pointForEachCourse);
        mnu_statistical.add(jSeparator4);

        mni_revenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Dollar.png"))); // NOI18N
        mni_revenue.setText("Doanh thu từng chuyên đề...");
        mni_revenue.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mni_revenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_revenueActionPerformed(evt);
            }
        });
        mnu_statistical.add(mni_revenue);

        jMenuBar1.add(mnu_statistical);

        mnu_help.setText("Trợ giúp");
        mnu_help.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mni_instruct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mni_instruct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Globe.png"))); // NOI18N
        mni_instruct.setText("Hướng dẫn sử dụng");
        mni_instruct.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mnu_help.add(mni_instruct);
        mnu_help.add(jSeparator5);

        mni_introduce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Brick house.png"))); // NOI18N
        mni_introduce.setText("Giới thiệu sản phẩm");
        mni_introduce.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mnu_help.add(mni_introduce);

        jMenuBar1.add(mnu_help);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_employeeManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_employeeManageActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_mni_employeeManageActionPerformed

    private void mni_learnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_learnerActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_mni_learnerActionPerformed

    private void mni_thematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_thematicActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_mni_thematicActionPerformed

    private void mni_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_loginActionPerformed
        // TODO add your handling code here:
        this.openLogin();
    }//GEN-LAST:event_mni_loginActionPerformed

    private void mni_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_logoutActionPerformed
        // TODO add your handling code here:
        this.logoff();
    }//GEN-LAST:event_mni_logoutActionPerformed

    private void mni_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_stopActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_mni_stopActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        this.logoff();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btn_stopActionPerformed

    private void btn_thematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thematicActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_btn_thematicActionPerformed

    private void btn_learnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_learnerActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_btn_learnerActionPerformed

    private void btn_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_courseActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_btn_courseActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        // TODO add your handling code here:
        this.openAbout();
    }//GEN-LAST:event_btn_helpActionPerformed

    private void mni_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_courseActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_mni_courseActionPerformed

    private void mni_learnersEveryYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_learnersEveryYearActionPerformed
        // TODO add your handling code here:
        this.openThongKe(0);
    }//GEN-LAST:event_mni_learnersEveryYearActionPerformed

    private void mni_scoreboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_scoreboardActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_mni_scoreboardActionPerformed

    private void mni_pointForEachCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_pointForEachCourseActionPerformed
        // TODO add your handling code here:
        this.openThongKe(2);
    }//GEN-LAST:event_mni_pointForEachCourseActionPerformed

    private void mni_revenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_revenueActionPerformed
        // TODO add your handling code here:
        this.openThongKe(3);
    }//GEN-LAST:event_mni_revenueActionPerformed

    private void mni_changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_changePasswordActionPerformed
        // TODO add your handling code here:
        this.openChangePass();
    }//GEN-LAST:event_mni_changePasswordActionPerformed

    private void mnu_systemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_systemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_systemActionPerformed

    private void mni_forgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_forgotPassActionPerformed
        // TODO add your handling code here:
        this.openForgotPass();
    }//GEN-LAST:event_mni_forgotPassActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_hocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hocVienActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_btn_hocVienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    
    public void init(){
        setSize(1400, 750);
        setLocationRelativeTo(null);
        this.setIconImage(ShareHelper.getAppIcon());
        
        new Timer(1000, new ActionListener() {
            SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss a   ");
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                lbl_clock.setText(fm.format(new Date()));
            }
        }).start();
        this.openWelcom();
        this.openLogin();
    }
    
    void openLogin(){
        new DangNhapJDialog(this, true).setVisible(true);
    }
    
    void openWelcom(){
        new ChaoJDialog(this, true).setVisible(true);
    }
    
    void logoff(){
        ShareHelper.clear();
        this.openLogin();
    }
    
    void openChangePass(){
        if(ShareHelper.isLogin()){
            new DoiMatKhauJDialog(this, true).setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openForgotPass(){
        new QuenMatKhauJFrame().setVisible(true);
    }
    
    void exit(){
        if(DialogHelper.confirm(this, "Bạn thật sự muốn kết thúc?")){
            System.exit(0);
        }
    }
    
    void openNhanVien(){
        if(ShareHelper.isLogin()){
            new NhanVienJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openKhoaHoc(){
        if(ShareHelper.isLogin()){
            new KhoaHocJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openChuyenDe(){
        if(ShareHelper.isLogin()){
            new ChuyenDeJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openNguoiHoc(){
        if(ShareHelper.isLogin()){
            new NguoiHocJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openThongKe(int index){
        if(ShareHelper.isLogin()){
            if(index == 3 && !ShareHelper.isMangager()){
                DialogHelper.alert(this, "Bạn không có quyền xem thông tin doanh thu");
            }
            else{
                ThongKeJFrame tkwin = new ThongKeJFrame();
                tkwin.setVisible(true);
                tkwin.selectTab(index);
            }
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập");
        }
    }
    
    void openHocVien(){
        if(ShareHelper.isLogin()){
            new HocVienJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    void openAbout(){
        new GioiThieuJDialog(this, true).setVisible(true);
    }
    
    void openWebsite(){
        try {
//            Desktop.getDesktop().browse(new File);
        } catch (Exception e) {
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_hocVien;
    private javax.swing.JButton btn_learner;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_stop;
    private javax.swing.JButton btn_thematic;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JLabel lbl_clock;
    private javax.swing.JLabel lbl_content;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JMenuItem mni_changePassword;
    private javax.swing.JMenuItem mni_course;
    private javax.swing.JMenuItem mni_employeeManage;
    private javax.swing.JMenuItem mni_forgotPass;
    private javax.swing.JMenuItem mni_instruct;
    private javax.swing.JMenuItem mni_introduce;
    private javax.swing.JMenuItem mni_learner;
    private javax.swing.JMenuItem mni_learnersEveryYear;
    private javax.swing.JMenuItem mni_login;
    private javax.swing.JMenuItem mni_logout;
    private javax.swing.JMenuItem mni_pointForEachCourse;
    private javax.swing.JMenuItem mni_revenue;
    private javax.swing.JMenuItem mni_scoreboard;
    private javax.swing.JMenuItem mni_stop;
    private javax.swing.JMenuItem mni_thematic;
    private javax.swing.JMenu mnu_help;
    private javax.swing.JMenu mnu_manage;
    private javax.swing.JMenu mnu_statistical;
    private javax.swing.JMenu mnu_system;
    private com.k33ptoo.components.KGradientPanel panel;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
