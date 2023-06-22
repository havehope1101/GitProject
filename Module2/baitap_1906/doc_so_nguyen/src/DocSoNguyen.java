import java.util.Scanner;

public class DocSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so co 3 chu so: ");
        int x = scanner.nextInt();
        int a = x % 10;
        x=x/10;
        int b = x % 10;
        x=x/10;
        int c = x % 10;

        System.out.println("cach doc la: ");
        if(b != 0) {
            cachdoc(c);
            System.out.println("tram");
            cachdoc(b);
            System.out.println("muoi");
            cachdoc(a);
        } else {
            cachdoc(c);
            System.out.println("tram");
            System.out.println("linh");
            cachdoc(a);
        }
    }

        static int number = 0;
    public static void cachdoc(int number) {

        switch (number) {
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9:
                System.out.println("chin");
                break;
        }
    }
}
