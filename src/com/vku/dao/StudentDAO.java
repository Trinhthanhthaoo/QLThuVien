/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.dao;

import com.vku.common.Database;
import com.vku.model.Student;
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
public class StudentDAO {

    public static List<Student> getAll() {

        List<Student> students = new ArrayList<>();

        try {
            String sql = "select * from sinhvien";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String MaSV = rs.getString("MaSV");
                String HoDem = rs.getString("HoDem");
                String Ten = rs.getString("Ten");
                int GioiTinh = Integer.valueOf(rs.getString("GioiTinh")); // cast
                String NgaySinh = rs.getString("NgaySinh");
                String NoiSinh = rs.getString("NoiSinh");
                String Malop = rs.getString("Malop");
                
                Student student = new Student(MaSV, HoDem, Ten, GioiTinh, NgaySinh, NoiSinh, Malop);
                students.add(student);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return students;

    }
    public static boolean update(Student student) {
// String sql = "update SINHVIEN\n" +
//"set \n" +
//"    Hodem = ?,\n" +
//"    Ten = ?,\n" +
//"    GioiTinh = ?,\n" +
//"    NgaySinh = ?, \n" +
//"    NoiSinh = ?,\n" +
//"    MaLop = ?\n" +
//"where\n" +
//"    MaSV = ?";
        try {
//    String sql = "update SINHVIEN\n" +
//"set \n" +
//"    Hodem = N'Lê Ngọc',\n" +
//"    Ten = N'Trúc',\n" +
//"    GioiTinh = 1,\n" +
//"    NgaySinh = '2005-04-27', \n" +
//"    NoiSinh = N'Đại Lộc',\n" +
//"    MaLop = 'java'\n" +
//"where\n" +
//"    MaSV = 'dl15-059";
 String sql = "update SINHVIEN\n" +
"set \n" +
"    Hodem = ?,\n" +
"    Ten = ?,\n" +
"    GioiTinh = ?,\n" +
"    NgaySinh = ?, \n" +
"    NoiSinh = ?,\n" +
"    MaLop = ?\n" +
"where\n" +
"    MaSV = ?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(7, student.getMaSV());
            ps.setString(1, student.getHoDem());
            ps.setString(2, student.getTen());
            ps.setInt(3, student.getGioiTinh());
            ps.setString(4, student.getNgaySinh());
            ps.setString(5, student.getNoiSinh());
            ps.setString(6 , student.getMalop());
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    public static boolean insert(Student student){
        //	INSERT INTO SINHVIEN VALUES ('dl0100-05', N'Đỗ', N'Ngọc', 0, CONVERT(DATE, '2002-09-21'), N'Bình Sơn, Quảng Ngãi', 'dl03')
        /*
        try{
        String sql = insert into SINHVIEN
        PreparedStatement ps = Database.getConnection().prepareCall(sql)
        ps.setString (1, student.getMaSV());
        */
        
     try {
            String sql = "INSERT INTO SINHVIEN \n" +
"VALUES\n" +
"(?, ?,?, ?, ?,?,?)"; ;
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, student.getMaSV());
            ps.setString(2, student.getHoDem());
            ps.setString(3, student.getTen());
            ps.setInt(4, student.getGioiTinh());
            ps.setString(5, student.getNgaySinh());
            ps.setString(6, student.getNoiSinh());
            ps.setString(7 , student.getMalop());
           
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
                 
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

      }
    public static boolean delete(Student student){
     try {
            String sql = "DELETE FROM SINHVIEN\n"+
"WHERE MaSV = " +"?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, student.getMaSV());
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(StudentDAO.getAll());
        
    }

}
