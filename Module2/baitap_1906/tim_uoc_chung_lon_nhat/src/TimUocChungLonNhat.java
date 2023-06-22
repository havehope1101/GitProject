import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("hay nhap vao so b: ");
        int b = scanner.nextInt();
        System.out.println("uoc chung lon nhat la: "+ timUocChung(a, b));
    }

    public static int timUocChung(int a, int b) {
        int uocchung = 0;
        if(a < b) {
            for (int i=1;i <= a/2; i++) {
                if(a % i == 0 && b % i == 0) {
                    uocchung = i;
                }
            }
            return uocchung;
        }
        else {
            for (int i=1;i < a/2; i++) {
                if(a % i == 0 && b % i == 0) {
                    uocchung = i;
                }
            }
            return uocchung;
        }
    }
}
