/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leducbinh_59130126_baitapjava;

/**
 *
 * @author GIGABYTE
 */
public class main {
    
    public static void main(String[] args) {
    NhanVien nv1 = new NhanVien();
    NhanVien nv2 = new NhanVien();
    nv1.setTen("Tran Van A");
    nv1.setTuoi(30);
    nv1.setDiaChi("Dong Hoa Phu Yen");
    nv1.setTienLuong(5000000);
    nv1.setTongGioLam(50);
    nv2.setTen("Tran Van B");
    nv2.setTuoi(20);
    nv2.setDiaChi("Tuy Hoa Phu Yen");
    nv2.setTienLuong(1000000);
    nv2.setTongGioLam(100);

    System.out.println(nv1.getThongTin());
    System.out.println(nv2.getThongTin());
  }
}
