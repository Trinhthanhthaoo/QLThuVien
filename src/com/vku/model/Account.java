/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.model;

/**
 *
 * @author admin!
 */
public class Account {
    
    public static String name = "";
    
    private String username;
    private String password;
    private String enterpassword;
    public Account() {
    }

//    public Account(String username, String password ) {
//        this.username = username;
//        this.password = password;
//        this.enterpassword = enterpassword;
//        
//        name = this.username;
//    }

    public Account(String username, String password, String enterpassword) {
        // Để thay đổi nội dung của các phương thức được tạo, choose Tools | Templates.
         this.username = username;
        this.password = password;
        this.enterpassword = enterpassword;
        
        name = this.username;
    }

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

    public String getEnterpassword() {
        return enterpassword;
    }

    public void setEnterpassword(String enterpassword) {
        this.enterpassword = enterpassword;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", enterpassword=" + enterpassword + '}';
    }

   
    
    
}
