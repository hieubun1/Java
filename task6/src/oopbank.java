import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    // Thuộc tính
    private String accountNumber;
    private double balance;

    // Constructor để khởi tạo tài khoản với số tài khoản và số dư ban đầu
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Phương thức gửi tiền (deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Đã gửi: " + amount + " VND. Số dư hiện tại: " + balance + " VND.");
        } else {
            System.out.println("Số tiền gửi không hợp lệ!");
        }
    }

    // Phương thức rút tiền (withdraw)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Đã rút: " + amount + " VND. Số dư còn lại: " + balance + " VND.");
        } else if (amount > balance) {
            System.out.println("Số dư không đủ để rút tiền!");
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
    }

    // Phương thức kiểm tra số dư tài khoản (getBalance)
    public double getBalance() {
        return balance;
    }

    // Phương thức hiển thị thông tin tài khoản
    public void displayAccountInfo() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Số dư: " + balance + " VND");
    }
}

public class oopbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo tài khoản mới với số dư ban đầu
        BankAccount account = new BankAccount("123456789", 500000);

        // Vòng lặp để cho phép người dùng chọn dịch vụ
        while (true) {
            try {
                System.out.println("\nChọn dịch vụ:");
                System.out.println("1. Gửi tiền");
                System.out.println("2. Rút tiền");
                System.out.println("3. Kiểm tra số dư");
                System.out.println("4. Thoát");
                System.out.print("Lựa chọn của bạn: ");
                int choice = scanner.nextInt();

                // Xử lý các lựa chọn của người dùng
                switch (choice) {
                    case 1:
                        System.out.print("Nhập số tiền cần gửi: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Nhập số tiền cần rút: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Số dư hiện tại: " + account.getBalance() + " VND.");
                        break;
                    case 4:
                        System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                        scanner.close();
                        return; // Thoát chương trình
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số hợp lệ!");
                scanner.next(); // Bỏ qua dữ liệu nhập sai
            }
        }
    }
}
