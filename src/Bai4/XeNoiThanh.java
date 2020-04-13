/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author GIGABYTE
 */
public class XeNoiThanh extends ChuyenXe
{
    public String sotyen;
    public double sokm;
    public XeNoiThanh(String masochuyen, String hotentaixe, String soxe double doanhthu, String sotuyen,double sokm)
    {
        super (masochuyen,hotentaixem,soxe,doanhthu);
        this.sotyen = sotuyen;
        this.sokm = sokm;
    }
      public void xuat() {
      super.xuat();
      System.out.println("Tuyen: " + this.soTuyen);
      System.out.println("So km di duoc: " + this.soKm);
    }
}
