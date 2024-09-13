import java.util.Scanner;

public class ktranguyento {
    public static void ktra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " không phải số nguyên tố!");
        } else {
            boolean nguyento = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {//bắt đầu vòng for từ 2 vì ko cần chạy 1 nếu là 1 thì sẽ in ra ko phải số nguyên tố
                if(n % i == 0) {//nếu n chia hết cho 1 số nào đó trong vòng for thì  sẽ trả về false và dừng vòng lặp
                    nguyento =false;
                    break;
                }
            }
            if (nguyento) {
                System.out.println(n+"là số nguyên tố!");
            }else {
                System.out.println(n+"không phải là số nguyên tố!");
            }
        }
    }
    public static void main(String[] args) {
        ktra();
    }

}
