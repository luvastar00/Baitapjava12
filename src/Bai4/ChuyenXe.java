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
abstract class ChuyenXe 
{
    public String masochuyen;
    public String hotentaixe;
    public String soxe;
    public double doanhthu;
    public ChuyenXe(String masochuyen, String hotentaixe, String soxe, double doanhthu)
    {
    this.masochuyen=masochuyen;
    this.hotentaixe=hotentaixe;
    this.soxe=soxe;
    this.doanhthu=doanhthu;
    }
    public void xuat()
    {
      System.out.println("Ma chuyen xe: " + this.masochuyen);
      System.out.println("Ho ten tai xe: " + this.hotentaixe);
      System.out.println("So xe: " + this.soxe);
      System.out.printf("Doanh thu: %.00f\n", this.doanhthu);
    }
}
