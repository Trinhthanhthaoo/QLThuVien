/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.dao;

import com.vku.common.Database;
import com.vku.model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin!
 */
public class AccountDAO {
    
    public static boolean checkLogin(Account account) {
        
        try {
            String sql = "select * from Account where Username=? and Password=?";
//            String sql = "select * from Account where Username='" + account.getUsername() + "' and Password='" + account.getPassword() + "'";
            PreparedStatement ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    // check
     public static void main(String[] args){
        if(AccountDAO.insert(new Account("trinh", "123", "123"))){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
     
     
    public static boolean insert(Account account){
        try {
            System.out.println(account);
            String sql = "INSERT INTO Account(username, password, enterpassword) VALUES (?, ?, ?)" ;
            PreparedStatement ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());
            ps.setString(3, account.getEnterpassword());
           
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

      }  
//    public static void main(String[] args) {
//        
//        if(AccountDAO.checkLogin(new Account("user01", "123456"))) {
//            System.out.println("Y");
//        } else {
//            System.out.println("N");
//        }
//        
//    }
    
}
