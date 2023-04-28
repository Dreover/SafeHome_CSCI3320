/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.sql.*;
import util.OracleConnection;
/**
 *
 * @author dondrebanksoverton
 */
public class Residents implements Serializable{
    private String username;
    private String password;

    private Connection conn = null;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String username, String password){
        boolean validated = false;
        try{
            conn = OracleConnection.getConnection();
            String sql = "select * from residents where username =? and password =?";
            // create statement
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            // run sql
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                validated = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            conn = null;
            OracleConnection.closeConnection();
        }
        
        return validated;
    }
  
