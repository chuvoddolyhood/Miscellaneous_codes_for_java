/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tran Nhan Nghia
 */
public class ConnectSQL {
    public static void main(String[] args){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            Connection con=DriverManager.getConnection(dbUrl);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from DVD");
            while(rs.next()){
                System.out.println("DVDCodeNo "+rs.getInt(1)+" DVD Title "+rs.getString(2));
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
     
}
