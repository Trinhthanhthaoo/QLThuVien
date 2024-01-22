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
public class LoanCoupon {
    private String maSach;
    private String maSV;
    private int soPhieu;
    private String ngayMuon;
    private String ngayTra;
    private String hodem;
    private String ten;
    public LoanCoupon(){
        
    }

    public LoanCoupon(String maSach, String maSV, int soPhieu, String ngayMuon, String ngayTra, String hodem, String ten) {
        this.maSach = maSach;
        this.maSV = maSV;
        this.soPhieu = soPhieu;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.hodem = hodem;
        this.ten = ten;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(int soPhieu) {
        this.soPhieu = soPhieu;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "LoanCoupon{" + "maSach=" + maSach + ", maSV=" + maSV + ", soPhieu=" + soPhieu + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + ", hodem=" + hodem + ", ten=" + ten + '}';
    }
    
}
