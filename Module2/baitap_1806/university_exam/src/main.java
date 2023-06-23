import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do {
            System.out.println("------Quan li thi sinh---------");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat khoi chuong trinh");
        } while ( choice != 0 );


    }
}
