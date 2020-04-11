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
public class SinhVienBiz extends SinhVienPoly {
    
    public double diemMaketing;
    public double diemSales;
    public SinhVienBiz(String hoten,String nganh,double diemMaketing,double diemSales)
    {
        super (hoten,nganh);
        this.diemMaketing=diemMaketing;
        this.diemSales=diemSales;
    }     
    double getDiem()
    {
        return (2*diemMaketing+diemSales)/3;
    }
}
