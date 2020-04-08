/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leducbinh_59130126_baitapjava;

import java.util.Scanner;

public class NhanVien {
    public String ten;
    public String diachi;
    public int tuoi;
    public float luong;
    public int tongsogiolam;
   
    
    public float getluong()
    {
        return luong;
    }
    public void setluong(float luong)
    {
    this.luong = luong;
     }
    public int gettuoi()
    {
        return tuoi;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public String getten()
    {
        return ten;
        
    }
    public void setten(String ten)
    {
    this.ten = ten;
    }
    public String getdiachi()
    {
    return diachi;
    
    }
    public void setdiachi(String diachi)
    {
    this.diachi= diachi;
    }
    public int settongsogiolam()
            {
            return tongsogiolam;
            }
    public void gettongsogiolam(int tongsogiolam)
    {
    this.tongsogiolam = tongsogiolam;
    }

    /**
     *
     */
    public static void thongtin()
    {
        Scanner nhap = new Scanner(System.in);
                System.out.println("Nhap ten");
                ten=nhap.nextline();
                System.out.println("Nhap tuoi");
                tuoi=nhap.nextint();
                System.out.println("Nhap dia chi");
                diachi = nhap.nextline();
                System.out.println("Nhap Dia chi");
    }
}
