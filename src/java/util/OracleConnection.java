/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
/**
 *
 * @author dondrebanksoverton
 */
public class OracleConnection {
    private static Connection connection = null;
    
    public static Connection getConnection(){
        try{
            System.out.println("Connecting to Oracle...");
            //load jdbc driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //create connection object
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@168.28.42.148:1521:csit", 
                    "dbanksoverton", ///use your oracle user name
                    "dbanksoverton"); //use your oracle password
        }catch(Exception exps){
            exps.printStackTrace();
            return null;
        }
        return connection;
    }
    
    public static void closeConnection(){
        try{
            //close connection
            connection.close();
        }catch(Exception exps){
            exps.printStackTrace();
        }
    }
    
}
