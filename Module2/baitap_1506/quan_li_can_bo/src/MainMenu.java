import Manage.Manage;
import Model.Cadres;

import java.util.Scanner;

public class MainMenu {
        Manage manage = new Manage();

        private Scanner input = new Scanner(System.in);

        public MainMenu() {
            manage = new Manage();
        }

        public void showMainMenu() {
            String menu = "=======Main Menu=========\n1.Add Cadres\n2.Find By Name\n3.Show Cadres\n0.Exit";
            int choice;
            do {
                System.out.println(menu);
                System.out.println("input your choice: \n");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        manage.addCadres();
                    break;

                    case 2:

                    break;

                    case 3:
                        manage.showCadres();
                    default:;
                }
            }   while (choice !=0) ;
        }
    }


