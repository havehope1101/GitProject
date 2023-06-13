import java.util.Arrays;
import java.util.Scanner;

public class btThemPhanTuVaoMang {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 6, 3, 7, 0, 0, 0, 0};
        int[] newArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao X: ");
        int x = scanner.nextInt();
        System.out.println("nhap vao vi tri can chen: ");
        int viTri = scanner.nextInt();

        if (viTri <= -1 | viTri >= arr.length - 1) {
            System.out.println("khong chen duoc phan tu vao mang");
        } else {
            for (int i = 0; i < newArr.length; i++) {
                if (i < viTri) {
                    newArr[i] = arr[i];
                } else if (i == viTri) {
                    newArr[i] = x;
                } else {
                    newArr[i] = arr[i -1];
                }
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}


