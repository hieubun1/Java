import java.util.Scanner;
public class maytinh {
    public static void maytinh() {
        Scanner sc = new Scanner(System.in);
        //nhap vao so a
        System.out.println("nhập vào số a: ");
        double a = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        // nhap vao so b
        System.out.println("nhập vào số b: ");
        double b = sc1.nextDouble();

        // nhap vao phep tinh ban muon
        System.out.print("Nhập phép toán (+, -, *, /): ");
        char operator = sc1.next().charAt(0);
        double result;

        // chon tu operator
        switch (operator) {
            case '+':
                // dua ra ket qua cong neu chon dau +
                result = a + b;
                System.out.println("ket qua cua phep cong: " + result);
                break;
                case '-':
                    // dua ra ket qua tru neu chon dau -
                    result = a - b;
                    System.out.println("ket qua cua phep tru: " + result);
                    break;

                    case '*':
                        // dua ra ket qua nhan neu chon dau *
                        result = a * b;
                        System.out.println("ket qua cua phep nhan: " + result);
                        break;
                        case '/':
                            // dua ra ket chia neu chon dau /
                            result = a / b;
                            System.out.println("ket qua cua phep chia: " + result);
                            break;
        }
    }
    public static void main(String[] args) {
        maytinh();
    }
}
