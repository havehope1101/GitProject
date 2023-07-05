import java.util.Scanner;

public class CheckInput {

    private static Scanner inputString = new Scanner(System.in);

    public static int checkInput() {
            int input;
            while (true) {
                try {
                    input = Integer.parseInt(inputString.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("pls input number format, my fen");
                }
            }
            return input;
        }

        public static String getInputString() {
            return inputString.nextLine();
        }
    }

