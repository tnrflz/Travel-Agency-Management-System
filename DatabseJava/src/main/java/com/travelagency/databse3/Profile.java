/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.databse3;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Make Rezervation");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Update Profile");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Log Out");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static BilgiUpdate b = new BilgiUpdate();
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        b.getButAdminProfil().setVisible(false);
        b.setVisible(true);


        int log = Login.Loginid;

        PreparedStatement ps1;
        ResultSet rs;
        String query=" SELECT  `Customer Name`, `Mobile Number`, `Email`, `Birthday` FROM `customer` WHERE `Login ID`=? " ;



        try {
            ps1=NewClass.getConnection().prepareStatement(query);
            ps1.setInt(1,log);

            rs=ps1.executeQuery();

            while (rs.next())
            {

                b.getTFname().setText(rs.getString(1));
                b.getTFmobileno().setText(rs.getString(2));
                b.getTFemail().setText(rs.getString(3));
                b.getTFbirthday().setText(rs.getString(4));

            }

            String col1 ="";
            String col2="";
            String col3="";
            String col4= "5";
            String col5= "Purchased";
            int col6= 0;
            int bookid=0;
            int tripid=10;
            ResultSet rs3;
            String query3="SELECT  `Trip ID`,`Book ID` FROM `manage` WHERE `Cus ID`=? " ;
            ps1=NewClass.getConnection().prepareStatement(query3);
            ps1.setInt(1,Login.cusid);
            rs3=ps1.executeQuery();
            while (rs3.next())
            {
               tripid =rs3.getInt(1);
               bookid = rs3.getInt(2);
               col6= tripid;

                ResultSet rs5;
                String query5="SELECT  `Booking Type` FROM `booking` WHERE `Booking ID`=?" ;
                ps1=NewClass.getConnection().prepareStatement(query5);
                ps1.setInt(1,bookid);
                rs5=ps1.executeQuery();
                if (rs5.next())
                {
                    col5=rs5.getNString(1);
                }




                DefaultTableModel model = (DefaultTableModel) b.getTableRez().getModel();

                ResultSet rs2;
                String query2="SELECT `Departure City`, `Arrival City`,`Trip Date`,  `Departure Time`, `Arrival Time`, `Price` FROM Trip WHERE `Trip ID`=? " ;
                ps1=NewClass.getConnection().prepareStatement(query2);
                ps1.setInt(1,tripid);
                rs2=ps1.executeQuery();

                while (rs2.next())
                {
                    b.getPanelTable().setVisible(true);
                    col1=rs2.getString(1) + " - " + rs2.getString(2);
                    col2= rs2.getString(3)  ;
                    col3=rs2.getString(4) +  " - " + rs2.getString(5);
                    col4=rs2.getString(6);



                    model.addRow(new Object[]{col6, col5, col1, col2, col3, col4 });

                    b.getTableRez().setModel(model);

                }

                b.getTableRez().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

                    public void valueChanged(ListSelectionEvent lse) {
                        int sel = b.getTableRez().getSelectedRow();
                        String s = (String) b.getTableRez().getValueAt(sel, 1);
                        System.out.println(s);

                        if (s.equals("Reserved")) {
                            b.getButPurc().setVisible(true);
                            b.getButCancel().setVisible(true);

                        }
                        else {
                            b.getButPurc().setVisible(false);
                            b.getButCancel().setVisible(false);

                        }
                    }
                });

            }





        } catch (Exception a) {
            System.out.println(a.getMessage());
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Trip().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
      setVisible(false);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
        
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                b.setVisible(false);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
