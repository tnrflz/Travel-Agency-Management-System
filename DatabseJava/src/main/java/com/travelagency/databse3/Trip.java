/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.databse3;

import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import java.sql.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
public class Trip extends javax.swing.JFrame {

    /**
     * Creates new form Trip
     */
    public Trip() {
        initComponents();
        jPanel1.setVisible(false);

        jLabel13.setVisible(false);
        LabEnuygun.setVisible(false);
        LabEncokziyaret.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        LabPersonTravel.setVisible(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CBarrive = new javax.swing.JComboBox<>();
        CBdeparture = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LabSeat = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ButtonReserve = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonPurc = new javax.swing.JButton();
        LabCity = new javax.swing.JLabel();
        LabDate = new javax.swing.JLabel();
        LabSaat = new javax.swing.JLabel();
        LabPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LabPlaka = new javax.swing.JLabel();
        ButStatistic = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        LabEnuygun = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LabEncokziyaret = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabPersonTravel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Trip");

        CBarrive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "İstanbul", "Ankara", "İzmir" }));
        CBarrive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBarriveİtemStateChanged(evt);
            }
        });

        CBdeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Eskişehir" }));
        CBdeparture.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBdepartureİtemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(List1);

        jLabel3.setText("Departure City");

        jLabel4.setText("Arrival City");

        jLabel5.setText("Date");

        jLabel9.setText("Time");

        LabSeat.setText("SeatText");

        jLabel10.setText("Price");

        jLabel11.setText("LicencePlate");

        jLabel12.setText("Number of Seats");

        ButtonReserve.setText("Reserve");
        ButtonReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReserveMouseClicked(evt);
            }
        });

        jLabel2.setText("Trip Info");

        ButtonPurc.setText("Purchase");
        ButtonPurc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPurcMouseClicked(evt);
            }
        });

        LabCity.setText("CityText");

        LabDate.setText("DateText");

        LabSaat.setText("TimeText");

        LabPrice.setText("PriceText");

        jLabel6.setText("City");

        jLabel7.setText("Bus Info");

        jLabel8.setText("Date");

        LabPlaka.setText("PlakaText");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabCity)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(ButtonPurc)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(4, 4, 4)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonReserve)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(LabPrice))
                                            .addComponent(jLabel10)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(LabDate))
                                .addGap(91, 91, 91)
                                .addComponent(LabSaat)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabPlaka)
                        .addGap(59, 59, 59)
                        .addComponent(LabSeat)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(jLabel11)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabDate)
                    .addComponent(LabCity)
                    .addComponent(LabSeat)
                    .addComponent(LabPlaka)
                    .addComponent(LabSaat)
                    .addComponent(LabPrice))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonReserve)
                    .addComponent(ButtonPurc))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ButStatistic.setText("Trip Statistics");
        ButStatistic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButStatisticMouseClicked(evt);
            }
        });

        jLabel13.setText("Cheapest Trip");

        LabEnuygun.setText("Cheapest");

        jLabel14.setText("Most Visited City");

        LabEncokziyaret.setText("LabEncokziyaret");

        jLabel15.setText("Most Travelled Person ");

        LabPersonTravel.setText("Person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButStatistic)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(CBdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBarrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(LabPersonTravel))
                            .addComponent(LabEncokziyaret)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabEnuygun)
                                .addGap(28, 28, 28)))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CBdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBarrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ButStatistic)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(LabEncokziyaret)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabPersonTravel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(LabEnuygun))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)))))
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Purchase p = new Purchase();

    public static int Tripid;

    private void CBarriveİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBarriveİtemStateChanged
        // TODO add your handling code here:


        String dep=CBdeparture.getSelectedItem().toString();
        String arrive=CBarrive.getSelectedItem().toString();


        PreparedStatement ps1;
        ResultSet rs;
        String query="SELECT `Trip Date` FROM Trip WHERE `Departure City`=? AND `Arrival City`=?";
        try {
            ps1=NewClass.getConnection().prepareStatement(query);
            ps1.setString(1,dep);
            ps1.setString(2,arrive);
            rs=ps1.executeQuery();

            final DefaultListModel model = new DefaultListModel();

            while (rs.next())
            {
                String k= (String.valueOf(rs.getDate(1)));
                model.addElement(k);
            }

            List1.setModel(model);

            List1.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {

                    jPanel1.setVisible(true);

                    String dep=CBdeparture.getSelectedItem().toString();
                    String arrive=CBarrive.getSelectedItem().toString();
                    String date =List1.getSelectedValue();


                    PreparedStatement ps1;
                    ResultSet rs;
                    String query="SELECT `Departure City`, `Arrival City`,`Trip Date`,  `Departure Time`, `Arrival Time`, `Price`, `License Plate`, `Number of Seats`, `Trip ID` FROM Trip WHERE `Departure City`=? AND `Arrival City`=? AND  `Trip Date`=? " ;
                    try {
                        ps1=NewClass.getConnection().prepareStatement(query);
                        ps1.setString(1,dep);
                        ps1.setString(2,arrive);
                        ps1.setString(3,date);
                        rs=ps1.executeQuery();
                        int i=1;
                        while (rs.next())
                        {


                            LabCity.setText(rs.getString(1) + "-" + rs.getString(2));
                            LabDate.setText(String.valueOf(rs.getDate(3)) );
                            LabSaat.setText(rs.getTime(4) + "-" + rs.getTime(5));
                            LabPrice.setText((String.valueOf(rs.getInt(6))) );
                            LabPlaka.setText((rs.getString(7)) );
                            LabSeat.setText(String.valueOf(rs.getInt(8)) );
                            Tripid = rs.getInt(9) ;

                        }





                    } catch (Exception a) {
                        System.out.println(a.getMessage());
                    }

                }
            });






        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_CBarriveİtemStateChanged

   public static int cusid = 1234;
    private void ButtonReserveMouseClicked(java.awt.event.MouseEvent evt)  {//GEN-FIRST:event_ButtonReserveMouseClicked
        // TODO add your handling code here:

        trip.setVisible(false);

        PreparedStatement ps1;
        PreparedStatement ps2;
        ResultSet rs;

            try {



            LocalDateTime tarih = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");
            System.out.println(dtf.format(tarih));
                String date2 = dtf.format(tarih);

                String query4 = "INSERT INTO `booking`( `Book Date`, `Booking Type`) VALUES(?,?) ";

                    ps1 = NewClass.getConnection().prepareStatement(query4);
                    ps1.setDate(1, Date.valueOf(date2));
                    ps1.setString(2, "Reserved");

                    if (ps1.executeUpdate() > 0) {

                  //      JOptionPane.showMessageDialog(null, "New user Add");
                    }


ResultSet rs2;

            String query5 = "SELECT `Booking ID` FROM booking WHERE `Book Date` =? ";

                    int bookid=0;
            ps2 = NewClass.getConnection().prepareStatement(query5);
            ps2.setDate(1, Date.valueOf(date2));
            rs2=ps2.executeQuery();

            while (rs2.next()) {

                if (rs2.isLast()) {

                    bookid = rs2.getInt(1);
                }
            }

                String query3 = "INSERT INTO `manage`( `Cus ID`, `Book ID` , `Trip ID`) VALUES (?,?,?)";

                ps1 = NewClass.getConnection().prepareStatement(query3);
                ps1.setInt(1, Login.cusid);
                ps1.setInt(2, bookid);
                ps1.setInt(3, Tripid );

                if (ps1.executeUpdate() > 0) {

                   JOptionPane.showMessageDialog(null, "New reservation added");

                }



        }
        catch (Exception a) {
            System.out.println(a.getMessage());
        }


    }//GEN-LAST:event_ButtonReserveMouseClicked


        private void ButtonPurcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPurcMouseClicked
        // TODO add your handling code here:

            p.setVisible(true);
            p.getButPurcGuncelle().setVisible(false);
            p.getButPurcTrip().setVisible(true);

        }//GEN-LAST:event_ButtonPurcMouseClicked

    private void CBdepartureİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBdepartureİtemStateChanged
        // TODO add your handling code here:

        if (CBdeparture.getSelectedItem() == "Eskişehir") {

            final DefaultComboBoxModel model = new DefaultComboBoxModel();

                model.addElement("Select");
                model.addElement("İstanbul");
                model.addElement("Ankara");
                model.addElement("İzmir");

            CBarrive.setModel( model);
        }

        else {
            final DefaultComboBoxModel model = new DefaultComboBoxModel();
            final DefaultComboBoxModel model2 = new DefaultComboBoxModel();

            model.addElement("Select");

            CBarrive.setModel( model);
            List1.setModel(model2);

        }
    }//GEN-LAST:event_CBdepartureİtemStateChanged

    private void ButStatisticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButStatisticMouseClicked
        // TODO add your handling code here:

        jLabel13.setVisible(true);
        LabEnuygun.setVisible(true);
        LabEncokziyaret.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        LabPersonTravel.setVisible(true);

PreparedStatement ps2;
ResultSet rs2;

        try {
            String query2 = "SELECT  * FROM `trip` ORDER BY `trip`.`Price` ASC";
        ps2 = NewClass.getConnection().prepareStatement(query2);

        rs2=ps2.executeQuery();
        if (rs2.next()) {


            String s = rs2.getString(2) + " - " + rs2.getString(3) + " : " + rs2.getInt(6);
            LabEnuygun.setText(s);
            System.out.println(rs2.getString(2));
            System.out.println(rs2.getString(3));
            System.out.println(rs2.getInt(6));
        }

            String query3 = "SELECT * FROM `trip` ORDER BY `trip`.`Arrival City` ASC\n";
            ps2 = NewClass.getConnection().prepareStatement(query3);

            rs2=ps2.executeQuery();
            if (rs2.next()) {


                String s =  rs2.getString(3);
                LabEncokziyaret.setText(s);

            }

            String query4 = "SELECT `Cus ID` FROM `manage` GROUP BY `Cus ID` ORDER BY COUNT(`Cus ID`) DESC";
            ps2 = NewClass.getConnection().prepareStatement(query4);

            rs2=ps2.executeQuery();
            if (rs2.next()) {


                int s =  rs2.getInt(1);



                String query5 = "SELECT `Customer Name` FROM `customer` WHERE `Customer ID`=?";
                ps2 = NewClass.getConnection().prepareStatement(query5);
                ps2.setInt(1,s);

                rs2=ps2.executeQuery();
                if (rs2.next()) {


                    String name =  rs2.getString(1);
                    LabPersonTravel.setText(name);





                }

            }



        } catch (Exception e) {
        System.out.println(e.getMessage());
    }


}//GEN-LAST:event_ButStatisticMouseClicked


    /**
     * @param args the command line arguments
     */
    public static Trip trip = new Trip();
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
            java.util.logging.Logger.getLogger(Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                trip.setVisible(true);
            }
        });



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                p.setVisible(false);
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButStatistic;
    private javax.swing.JButton ButtonPurc;
    private javax.swing.JButton ButtonReserve;
    private javax.swing.JComboBox<String> CBarrive;
    private javax.swing.JComboBox<String> CBdeparture;
    private javax.swing.JLabel LabCity;
    private javax.swing.JLabel LabDate;
    private javax.swing.JLabel LabEncokziyaret;
    private javax.swing.JLabel LabEnuygun;
    private javax.swing.JLabel LabPersonTravel;
    private javax.swing.JLabel LabPlaka;
    private javax.swing.JLabel LabPrice;
    private javax.swing.JLabel LabSaat;
    private javax.swing.JLabel LabSeat;
    private javax.swing.JList<String> List1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
