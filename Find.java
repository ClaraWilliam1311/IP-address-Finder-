/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpl;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Find extends javax.swing.JInternalFrame {

    /**
     * Creates new form Find
     */
    public Find() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_domainname = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        btn_clear2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Find the IP address");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the domain name:");

        txt_domainname.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        txt_domainname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txt_domainname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_domainnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_domainnameFocusLost(evt);
            }
        });
        txt_domainname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_domainnameActionPerformed(evt);
            }
        });

        btn_find.setBackground(new java.awt.Color(0, 153, 153));
        btn_find.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setText("Find");
        btn_find.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_find.setBorderPainted(false);
        btn_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_findMousePressed(evt);
            }
        });
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        btn_clear2.setBackground(new java.awt.Color(0, 153, 153));
        btn_clear2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_clear2.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear2.setText("Clear");
        btn_clear2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_clear2.setBorderPainted(false);
        btn_clear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clear2MousePressed(evt);
            }
        });
        btn_clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_domainname, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(btn_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(txt_domainname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_domainnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_domainnameFocusGained
//        if(txt_domainname.getText().trim().equals("Enter the domain name"))
//        {
//            txt_domainname.setText("");
//            txt_domainname.setForeground(Color.black);
//        }
    }//GEN-LAST:event_txt_domainnameFocusGained

    private void txt_domainnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_domainnameFocusLost
//        if(txt_domainname.getText().equals("") || txt_domainname.getText().equals("Enter the domain name"))
//        {
//            txt_domainname.setText("Enter the domain name");
//            txt_domainname.setForeground(new Color(153,153,153));
//        }
    }//GEN-LAST:event_txt_domainnameFocusLost

    private void txt_domainnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_domainnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_domainnameActionPerformed

    private void btn_findMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_findMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findMousePressed

    private void btn_clear2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clear2MousePressed

    private void btn_clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear2ActionPerformed
        txt_domainname.setText("");
        
    }//GEN-LAST:event_btn_clear2ActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        user u1 = new user();
        String ip=u1.find(txt_domainname.getText());
        if(ip == "not found")
        {
            JOptionPane.showMessageDialog(null,"That domain name hasn't an IP Address");
        }
        else
            JOptionPane.showMessageDialog(null,"The IP Adress of "+txt_domainname.getText()+" is "+ip);
    }//GEN-LAST:event_btn_findActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear2;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_domainname;
    // End of variables declaration//GEN-END:variables
}
