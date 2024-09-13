import java.util.Scanner;

public class bangcuchuong {
    public static void cuuchuong() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào bảng cửu chương bạn muốn in đến: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){// tạo vòng for i là số tượng chưng cho số của mỗi bảng cửu chương
            for(int j=1;j<=n;j++){// lặp j để i * j đến khi j lặp hết n thì i sẽ tăng lên 1 đơn vị
                System.out.print(i + " x " + j + " = " + (i * j) + "\n");
            }
        }
    }
    public static void main(String[] args) {
        cuuchuong();
    }
}


