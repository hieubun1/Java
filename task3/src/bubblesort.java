import java.util.*;
public class bubblesort {
    public static int[] taomang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int m = sc.nextInt();
        // tao mang voi kich thuoc m
        int []a = new int[m];
        System.out.println("Nhap cac phan tu mang: ");
        for(int i = 0; i < m; i++){

            // nhap cac phan tu mang
            a[i] =sc.nextInt();
        }

        System.out.println("in mang vua nhap: ");
        for(int i = 0; i < m; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Xuống dòng sau khi in mảng
        return a; // Trả về mảng đã được nhập
    }
    public static void sapxep(int[] a) {
        for(int i = 0; i < (a.length - 1); i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println("Mang sau khi sap xep: "+Arrays.toString(a));
    }

        public static void main(String[] args) {
            int[] a = taomang();
            sapxep(a);


        }
}


