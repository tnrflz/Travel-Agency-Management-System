/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.databse3;
import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class NewClass {
    

      public static Connection getConnection(){
        Connection con=null;
         try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/odev","root","");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return con;
    }

    
}
