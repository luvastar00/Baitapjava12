/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author GIGABYTE
 */
import java.util.ArrayList;
import leducbinh_59130126_baitapjava.NhanVien;

/**
 * QuanLyNhanVien
 */
public class QuanLyNhanVien implements IQuanLy {

  // danh sach nhan vien
  ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

  // implement methods
  @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };

  @Override
  public void inDS() {
    for (NhanVien nv : dsNhanVien) {
      System.out.println(nv.getThongTin());
    }
  };
}
