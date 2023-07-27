package menu;

import checkData.CheckInput;
import fileIO.ReadDataComic;
import fileIO.WriteDataComic;
import identity.Comic;
import identity.Genres;
import identity.User;
import manage.ComicLibrary;
import manage.UserManagement;

import java.util.ArrayList;
import java.util.List;

import static fileIO.ReadDataComic.readDataComic;
import static fileIO.ReadDataUser.readDataUser;

public class UserMenu {
    ComicLibrary comicLibrary = new ComicLibrary();
    private UserManagement userManagement = new UserManagement();
    private WriteDataComic writeDataComic = new WriteDataComic();
    private ReadDataComic readDataComic = new ReadDataComic();

    public void showUserMenu() {
        int choice = -1;
        do {
            String mainMenu =
                    "1. Show all comic\n" +
                            "2. Search comic by title\n" +
                            "3. Search comic by author\n" +
                            "4. Search comic by genre\n" +
                            "5. Show available comic\n" +
                            "6. Buy comic\n" +
                            "0. Exit\n" +
                            "-----------------------------\n" +
                            "input your choice: ";

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
                    comicLibrary.getAvailableComic();
                    break;
                case 6:
                    buyComic();
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
        List<Comic> list = readDataComic("comic.txt");
//        List<Comic> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("\n");
        }
        System.out.print("\n");
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
        if (choose < Genres.values().length) {
            comicLibrary.checkGenre(Genres.values()[choose - 1].toString());
        }
    }

    public List<Comic> getAll() {
        return comicLibrary.getAll();
    }

    public void addComic() {
        System.out.println("input id:");
        int id = CheckInput.checkInput();
        System.out.println("input title");
        String title = CheckInput.getInputString();
        System.out.println("input author: ");
        String author = CheckInput.getInputString();
        System.out.println("input genre: ");
        ArrayList<String> arr = new ArrayList<>();
        {
            String genre;
            do {
                genre = CheckInput.getInputString();
                if (!genre.equals("")) {
                    arr.add(genre.toUpperCase());
                }
            } while (!genre.equals(""));
        }
        boolean availability = true;
        System.out.println("input value");
        int value = CheckInput.checkInput();

        Comic comic = new Comic(id, title, author, arr, availability, value);
        comicLibrary.add(comic);
        writeDataComic.writeDataToFile("comic.txt", comicLibrary.getAll());

        System.out.println("add comic success");
    }

    public void buyComic() {
        System.out.println("input id of comic you want to buy: ");
        int id = CheckInput.checkInput();
        List<Comic> list = readDataComic("comic.txt");
        boolean check = true;
        for (int i = 0; i <list.size() ; i++) {
            if(id==list.get(i).getComicId()) {
                System.out.println("buy success");
                check = true;
                break;
            }
            else {check = false;}
            }
        if(check == false) {
            System.out.println("wrong id. Try again");
        }


//        arr2.add("Storm");
    }
    int a = 5;
    int b = 5;
    int c = ++b;
    int d = c--;
}



