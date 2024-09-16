import java.util.Scanner;
import java.util.HashMap;

class KhachHang {
    private String ten;
    private String diaChi;
    private String soDienThoai;
    private String maKhach;

    public KhachHang(String maKhach, String ten, String diaChi, String soDienThoai) {
        this.maKhach = maKhach;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "ID: " + maKhach + ", Tên: " + ten + ", Địa chỉ: " + diaChi + ", Số điện thoại: " + soDienThoai;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}

public class quanlykhachhang {
    private static HashMap<String, KhachHang> khachHangMap = new HashMap<>();

    public static void them(String maKhachHang, KhachHang khachHang) {
        khachHangMap.put(maKhachHang, khachHang);
        System.out.println("Đã thêm khách hàng: " + khachHang);
    }

    public static void xoaKhachHang(String maKhachHang) {
        if (khachHangMap.containsKey(maKhachHang)) {
            khachHangMap.remove(maKhachHang);
            System.out.println("Đã xóa khách hàng có mã: " + maKhachHang);
        } else {
            System.out.println("Không tìm thấy khách hàng có mã: " + maKhachHang);
        }
    }

    public static void sua(String maKhachHang, KhachHang khachHangMoi) {
        if (khachHangMap.containsKey(maKhachHang)) {
            khachHangMap.put(maKhachHang, khachHangMoi);
            System.out.println("Đã sửa khách hàng có mã: " + maKhachHang);
        } else {
            System.out.println("Không tìm thấy khách hàng có mã: " + maKhachHang);
        }
    }

    public static void timKiemKhachHang(String maKhachHang) {
        if (khachHangMap.containsKey(maKhachHang)) {
            KhachHang khachHang = khachHangMap.get(maKhachHang);
            System.out.println("Thông tin khách hàng: " + khachHang);
        } else {
            System.out.println("Không tìm thấy khách hàng có mã: " + maKhachHang);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nQuản lý khách hàng!");
            System.out.println("1. Thêm khách hàng.");
            System.out.println("2. Xóa khách hàng.");
            System.out.println("3. Sửa thông tin khách hàng.");
            System.out.println("4. Tìm kiếm khách hàng.");
            System.out.println("5. Thoát!");
            System.out.print("Đưa ra lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã khách hàng: ");
                    String maKhachHang = sc.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập địa chỉ khách hàng: ");
                    String diaChi = sc.nextLine();
                    System.out.print("Nhập số điện thoại khách hàng: ");
                    String soDienThoai = sc.nextLine();
                    KhachHang khachHang = new KhachHang(maKhachHang, ten, diaChi, soDienThoai);
                    them(maKhachHang, khachHang);
                    break;

                case 2:
                    System.out.print("Nhập mã khách hàng cần xóa: ");
                    String maXoa = sc.nextLine();
                    xoaKhachHang(maXoa);
                    break;

                case 3:
                    System.out.print("Nhập mã khách hàng cần sửa: ");
                    String maSua = sc.nextLine();
                    System.out.print("Nhập tên khách hàng mới: ");
                    String tenMoi = sc.nextLine();
                    System.out.print("Nhập địa chỉ khách hàng mới: ");
                    String diaChiMoi = sc.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String sdtMoi = sc.nextLine();
                    KhachHang khachHangMoi = new KhachHang(maSua, tenMoi, diaChiMoi, sdtMoi);
                    sua(maSua, khachHangMoi);
                    break;

                case 4:
                    System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
                    String maTimKiem = sc.nextLine();
                    timKiemKhachHang(maTimKiem);
                    break;

                case 5:
                    run = false;
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Tùy chọn không hợp lệ, vui lòng thử lại.");
                    break;
            }
        }
        sc.close();
    }
}
