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
public class Student {
    
    private String MaSV;
    private String HoDem;
    private String Ten;
    private int GioiTinh;
    private String NgaySinh;
    private String NoiSinh;
    private String Malop;
    
    public Student(){
        
    }

    public Student(String MaSV, String HoDem, String Ten, int GioiTinh, String NgaySinh, String NoiSinh, String Malop) {
        this.MaSV = MaSV;
        this.HoDem = HoDem;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.Malop = Malop;
    }

    public Student(String masv, String hodem, String ten, String noisinh, String ngaysinh, int gioitinh, String malop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoDem() {
        return HoDem;
    }

    public void setHoDem(String HoDem) {
        this.HoDem = HoDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    @Override
    public String toString() {
        return "Student{" + "MaSV=" + MaSV + ", HoDem=" + HoDem + ", Ten=" + Ten + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", NoiSinh=" + NoiSinh + ", Malop=" + Malop + '}';
    }
    
    
    
}
