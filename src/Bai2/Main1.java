/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import leducbinh_59130126_baitapjava.NhanVien;

/**
 *
 * @author GIGABYTE
 */
public class Main1 {
     public static void main(String[] args) {
   
    IQuanLy qlNhanVien = new QuanLyNhanVien();

   
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Le Trung Kien");
    nv1.setTuoi(25);
    nv1.setDiaChi("Ha Noi");
    nv1.setTienLuong(5000000);
    nv1.setTongGioLam(60);

    NhanVien nv2 = new NhanVien();
    nv2.setTen("Tran Van Cap");
    nv2.setTuoi(23);
    nv2.setDiaChi("Da Nang");
    nv2.setTienLuong(10000000);
    nv2.setTongGioLam(50);

    NhanVien nv3 = new NhanVien();
    nv3.setTen("Tran Van Cuong");
    nv3.setTuoi(22);
    nv3.setDiaChi("Khanh Hoa");
    nv3.setTienLuong(1000000);
    nv3.setTongGioLam(200);

    NhanVien nv4 = new NhanVien();
    nv4.setTen("Tran Van Cao");
    nv4.setTuoi(23);
    nv4.setDiaChi("Phu Yen");
    nv4.setTienLuong(2000000);
    nv4.setTongGioLam(100);

    NhanVien nv5 = new NhanVien();
    nv5.setTen("Le Trung");
    nv5.setTuoi(24);
    nv5.setDiaChi("Ca Mau");
    nv5.setTienLuong(10000000);
    nv5.setTongGioLam(100);

    // add nhan vien list vao qlNhanVien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in danh sach nhan vie
    qlNhanVien.inDS();
  }
    
}
