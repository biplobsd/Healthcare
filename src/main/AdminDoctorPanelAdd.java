/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alpha4d
 */
public class AdminDoctorPanelAdd extends javax.swing.JFrame {

    /**
     * Creates new form DoctorPanel
     */
    public AdminDoctorPanelAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        remove = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        remove1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMarried = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jJoinningDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jGenderCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPhoneNo = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jQualification = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSpecialization = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jBloodGroupCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 44, 97));

        add.setBackground(new java.awt.Color(0, 204, 204));
        add.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        remove.setBackground(new java.awt.Color(0, 204, 204));
        remove.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("Remove");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 204, 204));
        update.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 204, 204));
        search.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        remove1.setBackground(new java.awt.Color(0, 204, 204));
        remove1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        remove1.setForeground(new java.awt.Color(255, 255, 255));
        remove1.setText("Doctors List");
        remove1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(remove1)
                        .addGap(0, 8, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(update)
                .addGap(46, 46, 46)
                .addComponent(search)
                .addGap(45, 45, 45)
                .addComponent(remove)
                .addGap(46, 46, 46)
                .addComponent(remove1)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 150, 640));

        jPanel4.setBackground(new java.awt.Color(24, 44, 97));

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Doctor");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hms60.png"))); // NOI18N
        jLabel1.setText("SOMS");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(232, 65, 24));
        jLabel13.setText("(Logout)");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(24, 44, 97));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField11.setText("Abdul Wahid");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 911, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jFullname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 198, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeActionPerformed(evt);
            }
        });
        jPanel1.add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 72, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jMarried.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMarried.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Marrired", "Unmarried" }));
        jPanel1.add(jMarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 483, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("Marital status");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jJoinningDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jJoinningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 139, 149, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setText("Jonning Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 136, -1, -1));

        jGenderCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));
        jPanel1.add(jGenderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel14.setText("Phone No.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jPhoneNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 175, -1));

        clear.setBackground(new java.awt.Color(234, 32, 39));
        clear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 90, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel16.setText("Qualifications");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        jQualification.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 400, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel17.setText("Specialization");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jSpecialization.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpecializationActionPerformed(evt);
            }
        });
        jPanel1.add(jSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 310, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel18.setText("Blood Group");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, -1, -1));

        jBloodGroupCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(jBloodGroupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jUserName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 198, -1));

        jPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jAddButton.setBackground(new java.awt.Color(6, 82, 221));
        jAddButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jAddButton.setForeground(new java.awt.Color(255, 255, 255));
        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 194, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        AdminDoctorPanelUpdate pupdate = new AdminDoctorPanelUpdate();
        pupdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        AdminDoctorPanelRemove pd = new AdminDoctorPanelRemove();
        pd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        AdminDoctorPanelSearch ps = new AdminDoctorPanelSearch();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchMouseClicked

    private void jSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpecializationActionPerformed

    private void jAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void remove1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseClicked
        AdminDoctorPanelList adl = new AdminDoctorPanelList();
        adl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_remove1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        AdminHomePage la = new AdminHomePage();
        la.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        LoginAsFrame al = new LoginAsFrame();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
    }//GEN-LAST:event_clearActionPerformed

    public void clear() {

        jUserName.setText("");
        jPassword.setText("");
        jFullname.setText("");
        jAge.setText("");
        jGenderCombo.setSelectedItem("Select");
        jAddress.setText("");
        jMarried.setSelectedItem("Select");
        jPhoneNo.setText("");
        jQualification.setText("");
        jSpecialization.setText("");
        jBloodGroupCombo.setSelectedItem("Select");
        jJoinningDate.setText("");
      

    }
    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        if (jUserName.getText().isEmpty()
                || jPassword.getText().isEmpty()
                || jFullname.getText().isEmpty()
                || jAge.getText().isEmpty()
                || jGenderCombo.getSelectedItem().toString().equalsIgnoreCase("select")
                || jAddress.getText().isEmpty()
                || jMarried.getSelectedItem().toString().equalsIgnoreCase("select")
                || jPhoneNo.getText().isEmpty()
                || jQualification.getText().isEmpty()
                || jJoinningDate.getText().isEmpty()
                || jBloodGroupCombo.getSelectedItem().toString().equalsIgnoreCase("select")) {
            JOptionPane.showMessageDialog(null, "Data Field is Empty",
                    "ERROR", JOptionPane.WARNING_MESSAGE);

        } else {
            String username = jUserName.getText();
            String password = jPassword.getText();
            String name = jFullname.getText();
            String age = jAge.getText();
            String gender = jGenderCombo.getSelectedItem().toString();
            String address = jAddress.getText();
            String maritial = jMarried.getSelectedItem().toString();
            String phone = jPhoneNo.getText();
            String qualification = jQualification.getText();
            String specialization = jSpecialization.getText();
            String blood = jBloodGroupCombo.getSelectedItem().toString();
            String joinDate = jJoinningDate.getText();
            String leaveDate = "Still Working";
            List<Doctor> chlist = new ArrayList<Doctor>();
            FileRead chfiledoctor=new FileRead();
            
                chlist = chfiledoctor.fileReadDoctor();
                int check = 0;
                for (Doctor a : chlist) {

                    if (username.equalsIgnoreCase(a.getUsername())) {
                        check = 1;
                    }
                }

                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Use Another Username");
                } else {
            Doctor aDoctor = new Doctor(qualification, specialization, joinDate, leaveDate, name, age, gender, address, maritial, phone, blood, username, password);
            FileWrite fw = new FileWrite();
            fw.fileWriteDoctor(aDoctor);
            JOptionPane.showMessageDialog(null, "Data Added Successfully",
                    "success", JOptionPane.WARNING_MESSAGE);
            clear();
        }
        }
    }//GEN-LAST:event_jAddButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDoctorPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDoctorPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDoctorPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDoctorPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDoctorPanelAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JButton clear;
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jAge;
    private javax.swing.JComboBox<String> jBloodGroupCombo;
    private javax.swing.JTextField jFullname;
    private javax.swing.JComboBox<String> jGenderCombo;
    private javax.swing.JTextField jJoinningDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMarried;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPhoneNo;
    private javax.swing.JTextField jQualification;
    private javax.swing.JTextField jSpecialization;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jUserName;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel remove1;
    private javax.swing.JLabel search;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
