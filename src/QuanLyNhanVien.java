import Bai2.IQuanLy;
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