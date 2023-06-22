import java.util.Scanner;

public class TinhTongBinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so x: ");
        int x = scanner.nextInt();
        System.out.println("nhap vao so y: ");
        int y = scanner.nextInt();
        tinhTong(x, y);
    }


    public static void tinhTong(int x, int y) {
        int tong = 0;
        if(x < y) {
            for (int i = x; i <= y; i++) {
                tong += i*i;
            }
        } else {
            for (int i = y; i <= x; i++) {
                tong += i*i;
            }
        }
        System.out.println("tong binh phuong cac so tu x den y la: " + tong);
    }
}
