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
public class Main {
    
  public static void main(String[] args) {
        SinhVienIT SVIT = new SinhVienIT("Tran Van A", "IT", 8, 8, 10);
        SinhVienBiz SVBZ = new SinhVienBiz("Tran Van B", "Bizz", 7, 7);
        SVIT.xuat();
        System.out.println("Diem: " + SVIT.getDiem());
        System.out.println("Hoc luc: " + SVIT.getHocLuc());
        SVBZ.xuat();
        System.out.println("Diem: " + SVBZ.getDiem());
        System.out.println("Hoc luc: " + SVBZ.getHocLuc());
    }
    
}
