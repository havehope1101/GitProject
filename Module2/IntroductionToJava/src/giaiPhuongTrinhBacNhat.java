import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf(" x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("co nghiem voi moi x");
            } else {
                System.out.print("vo nghiem");
            }
        }
    }
}