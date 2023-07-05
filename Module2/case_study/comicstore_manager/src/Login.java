import java.util.Scanner;

public class Login {

        public  Scanner scanner = new Scanner(System.in);

        public void loginMenu() {
            System.out.println("==== Welcome to the Funny store ====");
            System.out.println("1. Log in");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
        }


        public void checkLogin() {
        System.out.println("username:");
        String username = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();

        if(validateInput(username, password)) {
            if(authenticate(username, password)) {
                System.out.println("------------Login success------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("-------Redirecting to the homepage-------");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Menu menu = new Menu();
                menu.showMainMenu();
            } else {
                System.out.println("Login failed. wrong username or password ");
            }
        } else {
            System.out.println("Invalid username or password ");
        }
        
        scanner.close();
    }

    private static boolean validateInput(String username, String password) {
        int minUsernameLength = 4;
        int maxUsernameLength = 20;
        int minPasswordLength = 6;
        int maxPasswordLength = 20;

        boolean validUsername = username.length() >= minUsernameLength && username.length() <= maxUsernameLength;
        boolean validPassword = password.length() >= minPasswordLength && password.length() <= maxPasswordLength;

        return validUsername && validPassword;
    }

    private static boolean authenticate(String username, String password) {
        // Thực hiện xác thực thông tin đăng nhập ở đây
        // Ví dụ: so sánh với tên đăng nhập và mật khẩu đã lưu trữ
        return username.equals("hahaha1") && password.equals("hahaha1");
    }
}
