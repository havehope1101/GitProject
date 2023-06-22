import java.util.Scanner;

public class TinhTongDaySo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong n: ");
        double n = scanner.nextDouble();
        System.out.println("tong can tim la "+ (tinhTong(n)+100));
    }

    public static double tinhTong(double n) {
        double tong = 0;
        for(double i = 1; i <= n; i++) {
            tong += (i / (i + 2));
        }
        return tong;
    }

}

