import java.util.InputMismatchException;
import java.util.Scanner;
public class xulyngoaile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {

            System.out.println("Nhap vao 1 so nguyen: ");
            n = sc.nextInt();

            System.out.println("So ban vua nhap la: "+n);
        }catch (InputMismatchException e){
            System.out.println("So vua nhap khong phai la so nguyen!");
            sc.nextLine();
        }
        sc.close();
    }
}
