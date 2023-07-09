package menu;

import checkData.CheckInput;
import identity.Comic;
import identity.Genres;
import manage.ComicLibrary;
import manage.UserManagement;

import java.util.List;

public class UserMenu {
    ComicLibrary comicLibrary = new ComicLibrary();
    UserManagement userManagement = new UserManagement();

    public void showUserMenu() {
        int choice = -1;
        do {
            String mainMenu =
                    "1. Show all comic\n" +
                    "2. Search comic by title\n" +
                    "3. Search comic by author\n" +
                    "4. Search comic by genre\n" +
                    "5. Show available comic\n" +
                    "6. Borrow comic\n" +
                    "7. Return comic\n" +
                    "0. Exit";

            System.out.println(mainMenu);

            choice = CheckInput.checkInput();

            switch (choice) {
                case 1:
                    showAllComics();
                    break;
                case 2:
                    searchByTitle();
                    break;
                case 3:
                    searchByAuthor();
                    break;
                case 4:
                    searchByGenre();
                    break;
                case 5:
//                    comicLibrary.getAvailableComic();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("What the hell did you just input ???. Try again.");
            }
        } while (choice != 0);
    }

    public void showAllComics() {
        System.out.println("List comic: ");
        List<Comic> list = userManagement.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public void searchByTitle() {

        System.out.println("please input title, my fen");
        String title = CheckInput.getInputString();
        comicLibrary.searchByTitle(title);
    }

    public void searchByAuthor() {
        System.out.println("Please input author, my fen");
        String author = CheckInput.getInputString();
        comicLibrary.searchByAuthor(author);
    }

    public void searchByGenre() {
        System.out.println("Here is the list of genre:\n");
        comicLibrary.displayByGenre();
        try {
            Thread.sleep(2000);
            System.out.println("What genre you want to search ?  (input number)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int choose = CheckInput.checkInput();
        if(choose<Genres.values().length){
            comicLibrary.checkGenre(Genres.values()[choose-1].toString());
        }
    }
}
