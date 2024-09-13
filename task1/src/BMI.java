import java.util.Scanner;

public class BMI {
    public BMI() {
    }

    public static void BMI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao: ");
        double chieucao = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập vao cân nặng: ");
        double cannang = sc1.nextDouble();
        double bmi = cannang / (chieucao * chieucao);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Phân loại: Bình thường ");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Phan loại: Thừa cân");
        } else {
            System.out.println("Phan loai: Béo phì");
        }

    }

    public static void main(String[] args) {
        System.out.println("chỉ số BMI la: ");
        BMI();
    }
}
