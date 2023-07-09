package menu;

import checkData.CheckValidate;
import identity.User;
import manage.UserManagement;
import menu.AdminMenu;
import checkData.CheckInput;
import menu.UserMenu;

public class Login {
//    List<User> users = new ArrayList<>();
    UserManagement userManagement = new UserManagement();

        public void showloginMenu() {
            System.out.println("==== Welcome to the Funny store ====");

            int choice = -1;
            do {
                String loginMenu = "1. Log in\n" +
                                   "2. Sign up\n" +
                                   "3. Exit\n" ;

                System.out.println(loginMenu);

                choice = CheckInput.checkInput();

                switch (choice) {
                    case 1:
                        checkLogin();
                        break;
                    case 2:
                        signup();
                        break;
                    case 3:
                        System.out.println("see you again");
                        System.exit(-1);
                        break;
                    default:
                        System.out.println("What the hell did you just input ???. Try again.");
                }
            } while (choice != 3);
        }


        public void checkLogin() {
        System.out.println("username:");
        String username = CheckInput.getInputString();
        System.out.println("password:");
        String password = CheckInput.getInputString();

        if(CheckValidate.validateInput(username, password)) {
            if(userManagement.authenticate(username, password)) {
                System.out.println("------------Login success------------");

              if(userManagement.checkRole(username)) {
                  try {
                      Thread.sleep(300);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("Redirecting to the Adminpage......................");
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  AdminMenu adminMenu = new AdminMenu();
                  adminMenu.showAdminMenu();
              }
              else {
                  try {
                      Thread.sleep(300);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("Redirecting to the homepage.....................");
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  UserMenu menu = new UserMenu();
                  menu.showUserMenu();
              }
            } else {
                System.out.println("Login failed. wrong username or password ");
            }
        } else {
            System.out.println("Invalid username or password ");
        }

    }

    private void signup() {

        System.out.println("input username (must be 4 or more characters):");
        String username = CheckInput.getInputString();
        System.out.println("input password (must be 6 or more characters):");
        String password = CheckInput.getInputString();
        System.out.println("re-input password");
        String rePassword = CheckInput.getInputString();
        int money = 0;

        if(CheckValidate.validateInput(username, password)) {
            if(password.equals(rePassword)) {
                System.out.println("Sign up success");

                User user = new User(username, password, money);
                userManagement.addUser(user);

            } else {
                System.out.println("password not match. Please try again");
            }
        } else {
            System.out.println("Invalid username or password. Please try again ");
        }
    }
}
