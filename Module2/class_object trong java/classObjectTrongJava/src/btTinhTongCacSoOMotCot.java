import java.util.Arrays;
import java.util.Scanner;

public class btTinhTongCacSoOMotCot {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        Scanner scanner = new Scanner(System.in);
        System.out.println("ban muon tinh tong cot so may: ");
        int cot = scanner.nextInt();

        int sum = 0;

        for(int i=0; i<10;i++){
            sum += matrix[i][cot];
        }

        System.out.println("tong cac so o cot "+ cot + " la " + sum);
    }
}
