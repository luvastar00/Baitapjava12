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
public class Main 
{
        public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();

        ChuyenXe xeNoiThanh1 = new XeNoiThanh("A001", "Tran Van A", "78A-77496", 1000, "Dong Hoa Phu Yen", 20);
        ChuyenXe xeNoiThanh2 = new XeNoiThanh("A002", "Tran Van B", "78B-88963", 2000, "Tuy Hoa Phu Yen", 21);
        ChuyenXe xeNoiThanh3 = new XeNoiThanh("A003", "Tran Van C", "78C-52631", 3000, "Song Cau Phu Yen", 22);

        qlcx.themChuyenXe(xeNoiThanh1);
        qlcx.themChuyenXe(xeNoiThanh2);
        qlcx.themChuyenXe(xeNoiThanh3);

        ChuyenXe xeNgoaiThanh1 = new XeNgoaiThanh("B001", "Tran Van D", "79A-56312", 4000, "Nha Trang Khanh Hoa", 1);
        ChuyenXe xeNgoaiThanh2 = new XeNgoaiThanh("B002", "Tran Van E", "79B-45963", 5000, "Van Gia Khanh Hoa", 1);
        ChuyenXe xeNgoaiThanh3 = new XeNgoaiThanh("B003", "Tran Van F", "79C-78956", 6000, "Cam Ranh Khanh Hoa", 1);

        qlcx.themChuyenXe(xeNgoaiThanh1);
        qlcx.themChuyenXe(xeNgoaiThanh2);
        qlcx.themChuyenXe(xeNgoaiThanh3);

        qlcx.inThongTin();

        
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlcx.tongDoanhThuNoiThanh());

        
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlcx.tongDoanhThuNgoaiThanh());

        
        System.out.printf("Tong doanh thu: %.00f\n", qlcx.tongDoanhThu());

        
    }
}
