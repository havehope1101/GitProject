package menu;

import manage.BookManage;

import java.util.Scanner;

public class Menu {
    private BookManage bookManage = new BookManage();
    private Scanner input = new Scanner(System.in);

    public void showMainMenu() {
        int choice;

        do {
            System.out.println("======= Main Menu ======\n1. Add new\n2. Delete by Id\n3. Display\n0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice !=0);
    }

    public void showMenuAdd() {
        System.out.println("this is add menu ");
        int choice;

        do {
            System.out.println("======= this is add menu ======\n1. Add new\n2. Delete by Id\n3. Display\n0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice !=0);
    }

}
