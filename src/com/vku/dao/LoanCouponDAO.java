/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.dao;
import com.vku.common.Database;
import com.vku.model.LoanCoupon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin!
 */
public class LoanCouponDAO {
    public static List<LoanCoupon> getAll() {

        List<LoanCoupon> loanCoupons = new ArrayList<>();

        try {
            String sql = "select * from Phieumuon";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 String maSach = rs.getString("maSach");
                String maSV = rs.getString("maSV");
                int soPhieu = Integer.valueOf(rs.getString("soPhieu")); // cast
                String ngayMuon = rs.getString("ngayMuon");
                String ngayTra = rs.getString("ngayTra");
                String hodem = rs.getString("hodem");
                String ten = rs.getString("ten");

                LoanCoupon lc = new LoanCoupon(maSach, maSV,soPhieu, ngayMuon,ngayTra,hodem,ten);
                loanCoupons.add(lc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return loanCoupons;

    }
    public static  List<LoanCoupon> getSearch(String loanCoupon){
        
         List<LoanCoupon> loanCoupons = new ArrayList<>();

        try {
            String sql = "select * from Phieumuon where Masach like ? or MaSV like ? or sophieu like ? or ngaymuon like ? or ngaytra like ? or HoDem like ? or Ten like ?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, '%' + loanCoupon + '%');
            ps.setString(2, '%' + loanCoupon + '%');
            ps.setString(3, '%' + loanCoupon + '%');
            ps.setString(4, '%' + loanCoupon + '%');
            ps.setString(5, '%' + loanCoupon + '%');
            ps.setString(6, '%' + loanCoupon + '%');
            ps.setString(7, '%' + loanCoupon + '%');
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
              String maSach = rs.getString("maSach");
                String maSV = rs.getString("maSV");
                int soPhieu = Integer.valueOf(rs.getString("soPhieu")); // cast
                String ngayMuon = rs.getString("ngayMuon");
                String ngayTra = rs.getString("ngayTra");
                String hodem = rs.getString("hodem");
                String ten = rs.getString("ten");

                LoanCoupon lc = new LoanCoupon(maSach, maSV,soPhieu, ngayMuon,ngayTra,hodem,ten);
                loanCoupons.add(lc);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoanCouponDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return loanCoupons;
    }

}
