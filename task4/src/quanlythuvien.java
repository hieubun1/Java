import java.util.ArrayList;
import java.util.Scanner;
public class quanlythuvien {
    public class thuvien{
        public static ArrayList<String> books = new ArrayList<>();

        // them sach vao thu vien
        public static void themsach(String book){
            books.add(book);
            System.out.println("Da them sach!"+book);
        }

        // xoa sach khoi thu vien
        public static  void xoasach(String book){
            //phuong thuc contains kiem tra xem dach sach books co chua ten quyen sach can xoa ko
           if(books.contains(book)){
               books.remove(book);
               System.out.println("Da xoa sach!"+book);
           }else{
               System.out.println("Không tìm thấy sách: " + book + " trong danh sách.");
           }

        }

        public static void suasach(String oldbook,String newbook){
            if(books.contains(oldbook)){
                // lấy chỉ số của cuốn sách cần sửa
                int index = books.indexOf(oldbook);

                books.set(index, newbook);
                System.out.println("Da sua sach!"+newbook);

            }else{
                System.out.println("Khong tim thay sach"+newbook);
            }

        }

        public static void timkiem(String book) {
            if(books.contains(book)){
                System.out.println("Da tim thay sach!"+book);
            }else{
                System.out.println("Khong tim thay sach"+book);
            }
        }
        // Hiển thị danh sách sách
        public static void hienThiSach() {
            if (books.isEmpty()) {
                System.out.println("Thư viện hiện không có sách.");
            } else {
                System.out.println("Danh sách sách trong thư viện:");
                for (String book : books) {
                    System.out.println("- " + book);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("\nQuan ly thu vien");
            System.out.println("1.Thêm sách");
            System.out.println("2.Hiển thị danh sách sách ");
            System.out.println("3.Xóa sách");
            System.out.println("4.Sửa sách");
            System.out.println("5.Tìm kiếm sách");
            System.out.println("6.Thoát");
            System.out.println("chọn một tùy chọn: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Nhập tên sách: ");
                    String book = sc.next();
                    thuvien.themsach(book);
                    break;

                case 2:
                    thuvien.hienThiSach();
                    break;

                case 3:
                    System.out.println("Nhập tên sách cần xóa: ");
                    String book1 = sc.next();
                    thuvien.xoasach(book1);
                    break;

                case 4:
                    System.out.println("Nhập tên sách cần sửa: ");
                    String book2 = sc.next();
                    thuvien.timkiem(book2);
                    break;

                case 5:
                    System.out.println("Nhập sách cần tìm: ");
                    String book3 = sc.next();
                    thuvien.timkiem(book3);
                    break;

                case 6:
                    run = false;
                    System.out.println("thoát!");
                    break;
                    default:
                        System.out.println("Tùy chọn không hợp lệ.Vui lòng chọn lại!");
                        break;

            }
        }
        sc.close();
    }
}
