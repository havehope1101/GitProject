import java.util.Scanner;

public class TimBoiChungNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("hay nhap vao so b: ");
        int b = scanner.nextInt();
        System.out.println("boi chung nho nhat la: "+ timBoiChung(a, b));
    }

    public static int timBoiChung(int a, int b) {
        int boichung = 0;
        if(a < b) {
            for (int i=b;; i++) {
                if(i % a == 0 && i % b == 0) {
                    boichung = i;
                    break;
                }
            }
            return boichung;
        }
        else {
            for (int i=a ;; i++) {
                if(i % a == 0 && i % b == 0) {
                    boichung = i;
                    break;
                }
            }
            return boichung;
        }
    }
}
