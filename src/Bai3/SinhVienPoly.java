/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author GIGABYTE
 */
// abstract sinhvienpoly
abstract class SinhVienPoly
{
    public String hoten;
    public String nganh;
    public SinhVienPoly(String hoten,String nganh)
     {
                this.hoten=hoten;
                this.nganh=nganh;
     }
    abstract double getDiem();
     public String getHocLuc(){
    if(this.getDiem()<5){
    return "Yeu";
    }
    if(this.getDiem()>=5&&this.getDiem()<6.5){
    return "Trung binh";
    }
    if(this.getDiem()>=6.5&&this.getDiem()<7.5){
    return "Kha";
    }
    if(this.getDiem()>=7.5&&this.getDiem()<9){
    return "Gioi";
    }
    return "Xuat sac";
    };
    public void xuat()
    {
         System.out.println("Ho ten: " + this.hoten + ", nganh hoc: " + this.nganh);
    }
}

