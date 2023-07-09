import menu.Login;
import menu.UserMenu;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.showloginMenu();
        UserMenu menu = new UserMenu();
        menu.showUserMenu();
    }
}
