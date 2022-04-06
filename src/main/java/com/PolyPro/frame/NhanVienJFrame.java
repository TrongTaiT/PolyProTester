/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PolyPro.frame;

import com.PolyPro.DAO.NhanVienDAO;
import com.PolyPro.entity.NhanVien;
import com.PolyPro.helper.DesignHelper;
import com.PolyPro.helper.DialogHelper;
import com.PolyPro.helper.ShareHelper;
import com.PolyPro.helper.ValidateHelper;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author NguyenTruongChinh
 */
public class NhanVienJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienJFrame
     */
    public NhanVienJFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirmPassword = new javax.swing.JPasswordField();
        txt_name = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_role = new javax.swing.JPanel();
        lbl_role = new javax.swing.JLabel();
        rdo_manager = new javax.swing.JRadioButton();
        rdo_staff = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        tabs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        txt_id.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_idFocusLost(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_password.setEchoChar('\u0000');
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });

        txt_confirmPassword.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_confirmPassword.setEchoChar('\u0000');
        txt_confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_confirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_confirmPasswordFocusLost(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(51, 255, 0));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Add.png"))); // NOI18N
        btn_add.setText("THÊM");
        btn_add.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btn_add.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 255, 0));
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Edit.png"))); // NOI18N
        btn_edit.setText("SỬA");
        btn_edit.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btn_edit.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_new.setBackground(new java.awt.Color(0, 255, 255));
        btn_new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/refresh-icon.png"))); // NOI18N
        btn_new.setText("MỚI");
        btn_new.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 51, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PolyPro/icons/Delete.png"))); // NOI18N
        btn_delete.setText("XÓA");
        btn_delete.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_first.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_prev.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_prev.setText("<<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        lbl_role.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_role.setText(" Vai trò");

        buttonGroup1.add(rdo_manager);
        rdo_manager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdo_manager.setSelected(true);
        rdo_manager.setText("Trưởng phòng");

        buttonGroup1.add(rdo_staff);
        rdo_staff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdo_staff.setText("Nhân viên");

        javax.swing.GroupLayout pnl_roleLayout = new javax.swing.GroupLayout(pnl_role);
        pnl_role.setLayout(pnl_roleLayout);
        pnl_roleLayout.setHorizontalGroup(
            pnl_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_roleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(rdo_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(rdo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_roleLayout.setVerticalGroup(
            pnl_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_roleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdo_manager)
                    .addComponent(rdo_staff)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_id)
                    .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_confirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_first)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prev)
                        .addGap(18, 18, 18)
                        .addComponent(btn_next)
                        .addGap(18, 18, 18)
                        .addComponent(btn_last)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnl_role, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_first)
                        .addComponent(btn_prev)
                        .addComponent(btn_next)
                        .addComponent(btn_last))
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbl_list.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_list.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_list.setRowHeight(25);
        tbl_list.setSelectionBackground(new java.awt.Color(51, 102, 255));
        tbl_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_list);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusGained
        // TODO add your handling code here:
        if (txt_id.getText().equals(" Mã nhân viên")) {
            txt_id.setText("");
            txt_id.requestFocus();
            DesignHelper.deleteTextField(txt_id);
        }
    }//GEN-LAST:event_txt_idFocusGained

    private void txt_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusLost
        // TODO add your handling code here:
        if (txt_id.getText().length() == 0) {
            DesignHelper.addTextField(txt_id);
            txt_id.setText(" Mã nhân viên");
        }
    }//GEN-LAST:event_txt_idFocusLost

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
        // TODO add your handling code here:
        if (txt_password.getText().equals(" Mật khẩu")) {
            txt_password.setText("");
            txt_password.requestFocus();
            txt_password.setEchoChar('\u25cf');
            DesignHelper.deleteTextField(txt_password);
        }
    }//GEN-LAST:event_txt_passwordFocusGained

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        // TODO add your handling code here:
        if (txt_password.getText().length() == 0) {
            DesignHelper.addTextField(txt_password);
            txt_password.setText(" Mật khẩu");
            txt_password.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txt_passwordFocusLost

    private void txt_confirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirmPasswordFocusGained
        // TODO add your handling code here:
        if (txt_confirmPassword.getText().equals(" Xác nhận mật khẩu")) {
            txt_confirmPassword.setText("");
            txt_confirmPassword.requestFocus();
            txt_confirmPassword.setEchoChar('\u25cf');
            DesignHelper.deleteTextField(txt_confirmPassword);
        }
    }//GEN-LAST:event_txt_confirmPasswordFocusGained

    private void txt_confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirmPasswordFocusLost
        // TODO add your handling code here:
        if (txt_confirmPassword.getText().length() == 0) {
            DesignHelper.addTextField(txt_confirmPassword);
            txt_confirmPassword.setText(" Xác nhận mật khẩu");
            txt_confirmPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txt_confirmPasswordFocusLost

    private void txt_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusGained
        // TODO add your handling code here:
        if (txt_name.getText().equals(" Họ và tên")) {
            txt_name.setText("");
            txt_name.requestFocus();
            DesignHelper.deleteTextField(txt_name);
        }
    }//GEN-LAST:event_txt_nameFocusGained

    private void txt_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusLost
        // TODO add your handling code here:
        if (txt_name.getText().length() == 0) {
            DesignHelper.addTextField(txt_name);
            txt_name.setText(" Họ và tên");
        }
    }//GEN-LAST:event_txt_nameFocusLost

    private void tbl_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tbl_list.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tbl_listMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            this.insert();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btn_lastActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JPanel pnl_role;
    private javax.swing.JRadioButton rdo_manager;
    private javax.swing.JRadioButton rdo_staff;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_list;
    private javax.swing.JPasswordField txt_confirmPassword;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;

    public void init() {
        setLocationRelativeTo(null);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setText();
        setTitleTable();
        this.fillToTable();
        this.row = -1;
        updateStatus();
    }

    DefaultTableModel model;

    public void setTitleTable() {
        model = new DefaultTableModel();
        model.addColumn("MÃ NHÂN VIÊN");
        model.addColumn("MẬT KHẨU");
        model.addColumn("HỌ VÀ TÊN");
        model.addColumn("VAI TRÒ");
        tbl_list.setModel(model);

        DesignHelper.setTable(tbl_list);
    }

    public void setText() {
        txt_id.setText(" Mã nhân viên");
        txt_password.setText(" Mật khẩu");
        txt_confirmPassword.setText(" Xác nhận mật khẩu");
        txt_name.setText(" Họ và tên");
        DesignHelper.addTextField(txt_id);
        DesignHelper.addTextField(txt_password);
        DesignHelper.addTextField(txt_confirmPassword);
        txt_password.setEchoChar('\u0000');
        txt_confirmPassword.setEchoChar('\u0000');
        DesignHelper.addTextField(txt_name);
    }

    void setPlaceHolder() {
        DesignHelper.deleteTextField(txt_id);
        DesignHelper.deleteTextField(txt_name);
        DesignHelper.deleteTextField(txt_password);
        DesignHelper.deleteTextField(txt_confirmPassword);
    }
    
    void setBackgroundDefault(){
        DesignHelper.setBackgroundDefault(txt_id);
        DesignHelper.setBackgroundDefault(txt_password);
        DesignHelper.setBackgroundDefault(txt_confirmPassword);
        DesignHelper.setBackgroundDefault(txt_name);
    }

    public void clearForm() {
        NhanVien nv = new NhanVien();
        setText();
        setBackgroundDefault();
        this.row = -1;
        this.updateStatus();
    }

    public void insert() {
        NhanVien nv = getForm();
        String matKhau2 = new String(txt_confirmPassword.getPassword());
        if (!matKhau2.equals(nv.getMatKhau())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
            DesignHelper.setBackgroundTrue(txt_confirmPassword);
        } else {
            try {
                dao.insert(nv);
                this.fillToTable();
                this.clearForm();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại");
            }
        }
    }

    public void update() {
        NhanVien nv = getForm();
        String matKhau2 = new String(txt_confirmPassword.getPassword());
        if (!matKhau2.equals(nv.getMatKhau())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
            txt_confirmPassword.setBackground(new Color(255, 51, 0));
        } else {
            try {
                dao.update(nv);
                this.fillToTable();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    public void delete() {
        if (!ShareHelper.isMangager()) {
            DialogHelper.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String manv = txt_id.getText();
            if (manv.equals(ShareHelper.user.getMaNV())) {
                DialogHelper.alert(this, "Bạn không thể xóa chính bạn!");
            } else if (DialogHelper.confirm(this, "Bạn thật sự muốn xóa nhân viên này?")) {
                try {
                    dao.delete(manv);
                    this.fillToTable();
                    this.clearForm();
                    DialogHelper.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    DialogHelper.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_list.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên table;
        try {
            List<NhanVien> list = dao.selectAll(); // đọc dữ liệu từ DTB
            for (NhanVien nv : list) {
                model.addRow(new Object[]{nv.getMaNV(), nv.getMatKhau(), nv.getHoTen(),
                    nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên"}); // thêm 1 hàng vào table
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    public void setForm(NhanVien nv) {
        setBackgroundDefault();
        txt_id.setText(nv.getMaNV());
        txt_name.setText(nv.getHoTen());
        txt_password.setText(nv.getMatKhau());
        txt_password.setEchoChar('\u25cf');
        txt_confirmPassword.setText(nv.getMatKhau());
        txt_confirmPassword.setEchoChar('\u25cf');
        rdo_manager.setSelected(nv.isVaiTro());
        rdo_staff.setSelected(!nv.isVaiTro());
    }

    public NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txt_id.getText());
        nv.setHoTen(txt_name.getText());
        nv.setMatKhau(new String(txt_password.getPassword()));
        nv.setVaiTro(rdo_manager.isSelected());
        return nv;
    }

    public void edit() {
        String manv = (String) tbl_list.getValueAt(this.row, 0);
        NhanVien nv = dao.selectById(manv);
        if (nv != null) {
            this.setForm(nv);
            this.setPlaceHolder();
            this.updateStatus();
            tabs.setSelectedIndex(0);
        }
    }

    public void first() {
        this.row = 0;
        this.edit();
    }

    public void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    public void next() {
        if (this.row < tbl_list.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    public void last() {
        this.row = tbl_list.getRowCount() - 1;
        this.edit();
    }

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tbl_list.getRowCount() - 1);

        // Trạng thái form
        txt_id.setEditable(!edit);
        btn_add.setEnabled(!edit);
        btn_edit.setEnabled(edit);
        btn_delete.setEnabled(edit);

        // Trạng thái điều hướng
        btn_first.setEnabled(edit && !first);
        btn_prev.setEnabled(edit && !first);
        btn_next.setEnabled(edit && !last);
        btn_last.setEnabled(edit && !last);
    }

    boolean isValidate() {
        String notification = "";
        NhanVien nv = dao.selectById(txt_id.getText());
        if (txt_id.getText().equalsIgnoreCase(" Mã nhân viên")) {
            notification += "Vui lòng nhập mã nhân viên!\n";
            DesignHelper.setBackgroundFalse(txt_id);
        } else if (ValidateHelper.checkMaNV(txt_id) == false) {
            notification += "Mã nhân viên phải từ 4-11 kí tự \n Không được sử dụng ký tự đặc biệt!\n";
        }else if (nv != null) {
            notification += "Mã nhân viên đã tồn tại!\n";
            DesignHelper.setBackgroundFalse(txt_id);
        }

        if (txt_password.getText().equalsIgnoreCase(" Mật khẩu")) {
            notification += "Vui lòng nhập mật khẩu!\n";
            DesignHelper.setBackgroundFalse(txt_password);
        } else if (ValidateHelper.checkPass(txt_password) == false) {
            notification += "Mật khẩu phải lớn hơn 6 ký tự \n Không được sử dụng ký tự đặc biệt!\n";
        }
        
        if (txt_confirmPassword.getText().equalsIgnoreCase(" Xác nhận mật khẩu")) {
            notification += "Vui lòng xác nhận mật khẩu!\n";
            DesignHelper.setBackgroundFalse(txt_confirmPassword);
        } 
        else if (ValidateHelper.checkPass(txt_confirmPassword) == false) {
            notification += "Mật khẩu phải lớn hơn 6 ký tự \n Không được sử dụng ký tự đặc biệt!\n";
        }

        if (txt_name.getText().equalsIgnoreCase(" Họ và tên")) {
            notification += "Vui lòng nhập họ và tên!\n";
            DesignHelper.setBackgroundFalse(txt_name);
        } else if (ValidateHelper.checkName(txt_name) == false) {
            notification += "Họ và tên phải từ 3-30 ký tự và không sử dụng số!\n";
        } 

        if (notification != "") {
            DialogHelper.alert(this, notification);
            return false;
        } else {
            DesignHelper.setBackgroundTrue(txt_id);
            DesignHelper.setBackgroundTrue(txt_password);
            DesignHelper.setBackgroundTrue(txt_confirmPassword);
            DesignHelper.setBackgroundTrue(txt_name);
            return true;
        }
    }

}