import identity.Comic;
import identity.Genres;
import manage.ComicLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    ComicLibrary comicLibrary = new ComicLibrary();

    
//    public Scanner inputNumber = new Scanner(System.in);
//    public Scanner inputString = new Scanner(System.in);
//
//    public int checkInput() {
//        int input;
//        while (true) {
//            try {
//                input = Integer.parseInt(inputString.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("pls input number format, my fen");
//            }
//        }
//        return input;
//    }
    

    public void showMainMenu() {
        int choice = -1;
        do {
            String mainMenu = "Main \n" +
                    "1. Show all comic\n" +
                    "2. Search comic by title\n" +
                    "3. Search comic by author\n" +
                    "4. Search comic by genre\n" +
                    "5. Show available comic\n" +
                    "6. Borrow comic\n" +
                    "7. Return comic\n" +
                    "8. Add comic (Only with admin permission)\n" +
                    "9. Remove comic (Only with admin permission)\n" +
                    "0. Exit";

            System.out.println(mainMenu);

            CheckInput.checkInput();

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
                    comicLibrary.getAvailableComic();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
//                    System.out.println("input id");
//                    int comicId = inputNumber.nextInt();
//                    System.out.println("input title");
//                    String inputtitle = CheckInput.getInputString();
//                    System.out.println("input author");
//                    String inputauthor = CheckInput.getInputString();
//                    comicLibrary.displayByGenre();
//                    System.out.println("choose genre from above list");
//                    int addgenre = inputNumber.nextInt();
//                    comicLibrary.addGenre(addgenre);
//
//
//
//                    Comic comic = new Comic(comicId, inputtitle, inputauthor, , true);



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
        List<Comic> list = comicLibrary.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toStringOnlyTitle());
        }
    }

    public void searchByTitle() {

        System.out.println("please input title, my fen");
        String title = CheckInput.getInputString();
        comicLibrary.searchByTitle(title);
    }

    public void searchByAuthor() {
        System.out.println("please input title, my fen");
        String author = CheckInput.getInputString();
        comicLibrary.searchByAuthor(author);
    }

    public void searchByGenre() {
        System.out.println("here is the list of genre:\n");
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
