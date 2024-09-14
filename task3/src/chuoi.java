import java.util.Scanner;
public class chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String chuoi = sc.nextLine();


        System.out.println("Nhap vao ky tu can dem: ");
        char kytu = sc.next().charAt(0);// Lấy ký tự đầu tiên từ chuỗi đầu vào


        int dem = 0;
        // Duyệt qua chuỗi và đếm số lần xuất hiện của ký tự
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                dem++;
            }
        }
        System.out.println("Ký tự "+kytu +" xuat hien "+dem+" lan!");
        sc.close();
    }

}
