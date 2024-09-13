import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị nhiet do: ");
        int temperature = sc.nextInt();

        System.out.println("Nhập lựa chọn chuyen doi (C or F ): ");
        String temp = sc.next();

        if (temp.equals("C")) {
            double Celsius = ctof(temperature);
            System.out.println("Celsius: " + Celsius);
        }else if (temp.equals("F")) {
            double Fahrenheit = ftoc(temperature);
            System.out.println("Fahrenheit: " + Fahrenheit);
        }else{
            System.out.println("ký tự không hợp lý");
        }

    }
    public static double ctof(double temperature){
        return temperature * 9 / 5 + 32;
    }
    public static double ftoc(double temperature){
        return (temperature - 32) * 5 / 9.0;
    }
}