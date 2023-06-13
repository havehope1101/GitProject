import java.util.Arrays;
import java.util.Scanner;

public class btXoaPhanTuKhoiMang {
        public static void main(String[] args) {

            int[] arr = {2,5,8,7,5,7,0,0,0,0};
            int[] newArr = {0, 0, 0, 0, 0, 0, 0, 0, 0};

            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao vi tri can xoa: ");
            int viTri = scanner.nextInt();

            if (viTri <= -1 | viTri >= arr.length - 1) {
                System.out.println("khong co vi tri nay");
            } else {
                for (int i = 0; i < newArr.length-1; i++) {
                    if (i < viTri) {
                        newArr[i] = arr[i];
                    } else
                        newArr[i] = arr[i + 1];
                }
                System.out.println(Arrays.toString(newArr));
            }
        }
    }

