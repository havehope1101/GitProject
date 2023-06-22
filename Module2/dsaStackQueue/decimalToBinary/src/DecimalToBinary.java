import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao so can chuyen doi: ");
        int x = scanner.nextInt();
        convert(x);
    }

    public static void convert(int x) {
        Stack <Integer> s = new Stack<>();
        while(x>0){
            int i = x % 2;
            x = x/2;
            s.push(i);
        }
        while(s.size()>0) {
            System.out.print(s.pop());
        }

    }
}
