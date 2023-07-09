package menu;

import checkData.CheckInput;
import identity.Comic;
import identity.User;
import manage.ComicLibrary;
import manage.UserManagement;


import java.util.ArrayList;
import java.util.List;

public class AdminMenu {
    UserManagement userManagement = new UserManagement();
    UserMenu userMenu = new UserMenu();

    public void showAdminMenu() {
        int choice = -1;
        do {
            String adminMenu = "1. Add user\n" +
                    "2. Remove user\n" +
                    "3. Display all user\n" +
                    "4. Show all comic\n" +
                    "5. Add comic\n" +
                    "0. Log out";

            System.out.println(adminMenu);

            choice = CheckInput.checkInput();

            switch (choice) {
                case 1:
                    userManagement.addUserByAdmin();
                    break;
                case 2:
                    removeUser();
                    break;
                case 3:
                    displayAllUser();
                    break;
                case 4:
                    userMenu.showAllComics();
                    break;
                case 5:
                    userManagement.addComic();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }

    private void removeUser() {

        System.out.println("input id of user you want to remove:");
        int id = CheckInput.checkInput();
        int index = findIndexById(id);
        if(index != -1) {
            userManagement.getAllUser().remove(index);
            System.out.println("remove success");
        }
        else {
            System.out.println("cannot find id " + id + ". Please check again");
        }
        }

    private void displayAllUser() {
        List<User> users = userManagement.getAllUser();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
    }

    public int findIndexById(int id) {
        List<User> users = userManagement.getAllUser();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId() == id) return i;
        }
        return -1;
    }




}