/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.databse3;



import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author DELL
 */
public class BilgiUpdate extends javax.swing.JFrame {

    /**
     * Creates new form BilgiUpdate
     */
    public BilgiUpdate() {
        initComponents();
        PanelTable.setVisible(false);
     //   ButCancel.setVisible(false);
    //    ButPurc.setVisible(false);
   //     TableRez.getModel().addTableModelListener(this);

    }





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRez = new javax.swing.JTable();
        ButPurc = new javax.swing.JButton();
        ButCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        PanellBilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        TFbirthday = new javax.swing.JTextField();
        ButAdminProfil = new javax.swing.JButton();
        TFemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFmobileno = new javax.swing.JTextField();
        ButCusProfil = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PanelPasswrod1 = new javax.swing.JPanel();
        ButPass = new javax.swing.JButton();
        TFneewPass = new javax.swing.JPasswordField();
        TFpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableRez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip No", "Book Type", "City", "Date", "Time", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableRez);
        if (TableRez.getColumnModel().getColumnCount() > 0) {
            TableRez.getColumnModel().getColumn(0).setResizable(false);
            TableRez.getColumnModel().getColumn(1).setResizable(false);
            TableRez.getColumnModel().getColumn(2).setResizable(false);
            TableRez.getColumnModel().getColumn(3).setResizable(false);
            TableRez.getColumnModel().getColumn(4).setResizable(false);
            TableRez.getColumnModel().getColumn(5).setResizable(false);
        }

        ButPurc.setText("Purchase");
        ButPurc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButPurcMouseClicked(evt);
            }
        });

        ButCancel.setText("Cancel");
        ButCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCancelMouseClicked(evt);
            }
        });

        jLabel8.setText("Change Reservation");

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(ButPurc)
                .addGap(18, 18, 18)
                .addComponent(ButCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButPurc)
                    .addComponent(ButCancel)))
        );

        jLabel1.setText("Name");

        jLabel2.setText("Birthday");

        ButAdminProfil.setText("Submit");
        ButAdminProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButAdminProfilMouseClicked(evt);
            }
        });

        jLabel4.setText("E-mail");

        jLabel3.setText("Mobile Number");

        ButCusProfil.setText("Submit");
        ButCusProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCusProfilMouseClicked(evt);
            }
        });

        jLabel6.setText("Update Profile");

        ButPass.setText("Submit");
        ButPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButPassMouseClicked(evt);
            }
        });

        jLabel7.setText("Change Passwrod");

        jLabel5.setText("New Passwrod");

        LabelPass.setText("Passwprd");

        javax.swing.GroupLayout PanelPasswrod1Layout = new javax.swing.GroupLayout(PanelPasswrod1);
        PanelPasswrod1.setLayout(PanelPasswrod1Layout);
        PanelPasswrod1Layout.setHorizontalGroup(
            PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPasswrod1Layout.createSequentialGroup()
                .addGroup(PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPasswrod1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(LabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFneewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButPass)))
                    .addComponent(jLabel7))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PanelPasswrod1Layout.setVerticalGroup(
            PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPasswrod1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPasswrod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFneewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(ButPass)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PanellBilgiLayout = new javax.swing.GroupLayout(PanellBilgi);
        PanellBilgi.setLayout(PanellBilgiLayout);
        PanellBilgiLayout.setHorizontalGroup(
            PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanellBilgiLayout.createSequentialGroup()
                .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanellBilgiLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFmobileno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(TFname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFbirthday, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFemail)))
                    .addGroup(PanellBilgiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(PanelPasswrod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanellBilgiLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(ButCusProfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButAdminProfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanellBilgiLayout.setVerticalGroup(
            PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanellBilgiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanellBilgiLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TFname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TFbirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanellBilgiLayout.createSequentialGroup()
                        .addComponent(PanelPasswrod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanellBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButCusProfil)
                    .addComponent(ButAdminProfil))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanellBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PanellBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents





    private void ButCusProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCusProfilMouseClicked
        // TODO add your handling code here:
        

        PreparedStatement ps1;
        String query1 = "UPDATE `customer` SET `Customer Name`=?,`Mobile Number`=?,`Email`=?,`Birthday`=? WHERE `Login ID`=?";
        try {
            ps1=NewClass.getConnection().prepareStatement(query1);

            ps1.setString(1,TFname.getText());
            ps1.setString(2,TFmobileno.getText());
            ps1.setString(3,TFemail.getText());
            ps1.setString(4,TFbirthday.getText());
            ps1.setInt(5,Login.Loginid);

            if(ps1.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Information updated");
                  }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }//GEN-LAST:event_ButCusProfilMouseClicked

    public static Purchase p = new Purchase();


    private void ButPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButPassMouseClicked
        // TODO add your handling code here:
        


        String password=String.valueOf(TFpassword.getPassword());
        String Newpassword=String.valueOf(TFneewPass.getPassword());


        PreparedStatement ps1;
        ResultSet rs;
        String query="SELECT * FROM Login WHERE  `Username` =? AND  `Password`=?";
        try {
            ps1=NewClass.getConnection().prepareStatement(query);
            ps1.setString(1,Login.username);
            ps1.setString(2,password);
            rs=ps1.executeQuery();
            if(rs.next())
            {
             //   JOptionPane.showMessageDialog(null,"You are in ");
                String query1 = "UPDATE `login` SET `Password`=? WHERE `Password`=?";
                try {
                    ps1=NewClass.getConnection().prepareStatement(query1);

                    ps1.setString(1,Newpassword);
                    ps1.setString(2,password);

                    if(ps1.executeUpdate()>0){
                        JOptionPane.showMessageDialog(null,"Password updated");}
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            else
                JOptionPane.showMessageDialog(null,"Please enter your password correctly");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }//GEN-LAST:event_ButPassMouseClicked

    private void ButCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCancelMouseClicked
        // TODO add your handling code here:

        PreparedStatement ps1 ;
        int i = TableRez.getSelectedRow();

        int tripid = (int) TableRez.getValueAt(i, 0);


        try {
            int bookid=0;
        ResultSet rs1;
        String query1="SELECT  `Book ID` FROM `manage` WHERE `Cus ID`=?  AND `Trip ID`=?" ;
        ps1=NewClass.getConnection().prepareStatement(query1);
        ps1.setInt(1,Login.cusid);
        ps1.setInt(2,tripid);
        rs1=ps1.executeQuery();
        if (rs1.next())
        {
            bookid =rs1.getInt(1);
        }



            String query4 = "DELETE FROM `manage` WHERE `Book ID`=?";

            ps1 = NewClass.getConnection().prepareStatement(query4);
            ps1.setInt(1, (bookid));

            if (ps1.executeUpdate() > 0) {

          //      JOptionPane.showMessageDialog(null, "Reservation cancelled");
            }



            String query2 = "DELETE FROM `booking` WHERE `Booking ID` =?";

            ps1 = NewClass.getConnection().prepareStatement(query2);
            ps1.setInt(1, (bookid));

            if (ps1.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Reservation cancelled");
            }
            DefaultTableModel model = (DefaultTableModel) getTableRez().getModel();




            model.removeRow(i);

            getTableRez().setModel(model);

        }


        catch (Exception a) {
            System.out.println(a.getMessage());
        }



    }//GEN-LAST:event_ButCancelMouseClicked

    public JButton getButAdminProfil() {
        return ButAdminProfil;
    }

    public void setButAdminProfil(JButton ButAdminProfil) {
        this.ButAdminProfil = ButAdminProfil;
    }

    public JButton getButCusProfil() {
        return ButCusProfil;
    }

    public void setButCusProfil(JButton ButCusProfil) {
        this.ButCusProfil = ButCusProfil;
    }

    private void ButAdminProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButAdminProfilMouseClicked
        // TODO add your handling code here:

        PreparedStatement ps1;
        String query1 = "UPDATE `admin` SET `Admin Name`=?,`Admin Telephone`=?,`Admin Email`=?,`Admin Birthday`=? WHERE `Login ID`=?";
        try {
            ps1=NewClass.getConnection().prepareStatement(query1);

            ps1.setString(1,TFname.getText());
            ps1.setString(2,TFmobileno.getText());
            ps1.setString(3,TFemail.getText());
            ps1.setString(4,TFbirthday.getText());
            ps1.setInt(5,Login.Loginid);

            if(ps1.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Information updated");}
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_ButAdminProfilMouseClicked

    public static int tripid;

    private void ButPurcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButPurcMouseClicked
        // TODO add your handling code here:

        int selected = TableRez.getSelectedRow();

        tripid = (int) TableRez.getModel().getValueAt(selected, 0);
        p.setVisible(true);
        p.getButPurcGuncelle().setVisible(true);
        p.getButPurcTrip().setVisible(false);



    }//GEN-LAST:event_ButPurcMouseClicked

    public JPanel getPanelTable() {
        return PanelTable;
    }

    public void setPanelTable(JPanel PanelTable) {
        this.PanelTable = PanelTable;
    }

    public JButton getButCancel() {
        return ButCancel;
    }

    public void setButCancel(JButton ButCancel) {
        this.ButCancel = ButCancel;
    }

    public JButton getButPurc() {
        return ButPurc;
    }

    public void setButPurc(JButton ButPurc) {
        this.ButPurc = ButPurc;
    }

    public JTextField getTFbirthday() {
        return TFbirthday;
    }

    public void setTFbirthday(JTextField TFbirthday) {
        this.TFbirthday = TFbirthday;
    }

    public JTextField getTFemail() {
        return TFemail;
    }

    public void setTFemail(JTextField TFemail) {
        this.TFemail = TFemail;
    }

    public JTextField getTFmobileno() {
        return TFmobileno;
    }

    public void setTFmobileno(JTextField TFmobileno) {
        this.TFmobileno = TFmobileno;
    }

    public JTextField getTFname() {
        return TFname;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public void setTFname(JTextField TFname) {
        this.TFname = TFname;
    }

    public  JTable getTableRez() {
        return TableRez;
    }

    public void setTableRez(JTable TableRez) {
        this.TableRez = TableRez;
    }

  /*  public void tableChanged(TableModelEvent e) {



    }
    */

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
            java.util.logging.Logger.getLogger(BilgiUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilgiUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilgiUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilgiUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilgiUpdate().setVisible(true);
            }
        });


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                p.setVisible(false);
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAdminProfil;
    private javax.swing.JButton ButCancel;
    private javax.swing.JButton ButCusProfil;
    private javax.swing.JButton ButPass;
    private javax.swing.JButton ButPurc;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JPanel PanelPasswrod1;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JPanel PanellBilgi;
    private javax.swing.JTextField TFbirthday;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFmobileno;
    private javax.swing.JTextField TFname;
    private javax.swing.JPasswordField TFneewPass;
    private javax.swing.JPasswordField TFpassword;
    private javax.swing.JTable TableRez;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
