import java.util.Scanner;

public class uocSoChungLonNhat {

    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        a = scanner.nextInt();
        System.out.println("nhap vao b");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0) {
            System.out.println("");
        }
    }
}
