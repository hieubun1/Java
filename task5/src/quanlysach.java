import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class Sach{
    private  String tensach;
    private  String tacgia;
    private int namXuatBan;

    public Sach(String tensach, String tacgia, int namXuatBan){
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.namXuatBan = namXuatBan;

    }
    @Override
    public String toString(){
        return tensach + " " + tacgia + " " + namXuatBan;
    }
}

public class quanlysach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sách
        System.out.println("Nhập thông tin sách:");

        System.out.print("Tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        // Tạo đối tượng Sach
        Sach sach = new Sach(tenSach, tacGia, namXuatBan);

        // Ghi thông tin sách vào file
        try (FileWriter fileWriter = new FileWriter("sach.txt", true)) {
            fileWriter.write(sach.toString() + "\n");
            System.out.println("Thông tin sách đã được lưu vào file sach.txt");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào file: " + e.getMessage());
        }

        // Đóng scanner
        scanner.close();
    }
}

