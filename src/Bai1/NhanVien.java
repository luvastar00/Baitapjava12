/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author GIGABYTE
 */
public class NhanVien {
  private String ten;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongGioLam;
   
    
    public void setTen(String ten) {
    this.ten = ten;
  }
  public String getTen() {
    return this.ten;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public int gettuoi() {
    return this.tuoi;
  }
  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }
  public String getDiaChi() {
    return this.diaChi;
  }
  public void setTienLuong(double tienLuong) {
    this.tienLuong = tienLuong;
  }
  public double getTienLuong() {
    return this.tienLuong;
  }
  public void setTongGioLam(int tongGioLam) {
    this.tongGioLam = tongGioLam;
  }
  public int getTongGioLam() {
    return this.tongGioLam;
  }
    
 public String getThongTin() {
    return "Ten Nhan Vien : " + this.ten + ", Tuoi: " + this.tuoi + ", Dia Chi: " + this.diaChi
      + ", Tien Luong : " + this.tienLuong + ", Tong Gio Lam: " + this.tongGioLam
      + ", Tien Thuong: " + this.tinhThuong();
  }
     public double tinhThuong() {
    if (this.tongGioLam >= 200) {
      return this.tienLuong * 0.2;
    } else if (this.tongGioLam >= 100) {
      return this.tienLuong * 0.1;
    }
    return 0;
  }
}