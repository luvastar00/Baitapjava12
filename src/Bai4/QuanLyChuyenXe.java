/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;

/**
 *
 * @author GIGABYTE
 */
class QuanLyChuyenXe 
{
     public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }

    
    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
      return dsChuyenXe;
    }

    
    public void inThongTin() {
      for(ChuyenXe cx : dsChuyenXe) {
        cx.xuat();
      }
    }

    
    public double tongDoanhThuNoiThanh() {
      double doanhthu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof XeNoiThanh) {
          doanhthu += cx.doanhthu;
        }
      }
      return doanhthu;
    }

    
    public double tongDoanhThuNgoaiThanh() {
      double doanhthu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof XeNgoaiThanh) {
          doanhthu += cx.doanhthu;
        }
      }
      return doanhthu;
    }

    
     public double tongDoanhThu() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        doanhThu += cx.doanhthu;
      }
      return doanhThu;
    }
}
