package manage;

import identity.Comic;
import identity.Genres;


import java.util.ArrayList;
import java.util.List;

public class ComicLibrary implements Management<Comic> {
    List<Comic> comics = new ArrayList<>();

    List<Genres> genre = new ArrayList<Genres>();


    //    ----------------------THIS IS TEST CODE---------------------------------------------
    public ComicLibrary() {
        int comicId1 = 1;
        String title1 = "My Comic";
        String author1 = "John Doe";
        ArrayList<String> genre1 = new ArrayList<>();
        genre1.add("ACTION");
        genre1.add("ADVENTURE");
        boolean availability1 = true;
        int value1 = 7000;

        Comic comic1 = new Comic(comicId1, title1, author1, genre1, availability1, value1);
        comics.add(comic1);

        int comicId2 = 2;
        String title2 = "Storm";
        String author2 = "Tuhlu";
        ArrayList<String> genre2 = new ArrayList<>();
        genre2.add("FUNNY");
        genre2.add("DRAMA");
        boolean availability2 = true;
        int value2 = 5000;

        Comic comic2 = new Comic(comicId2, title2, author2, genre2, availability2, value2);
        comics.add(comic2);
    }
// -------------------------------------------------------------------------------------------

    @Override
    public void add(Comic comic) {
        comics.add(comic);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        comics.remove(index);
    }

    public void searchByTitle(String title) {
        boolean check = true;
        for (Comic comic : comics) {
            if (comic.getTitle().toLowerCase().contains(title)) {
                System.out.println(comic);
                check = false;
            }
        }
        if (check) {
            System.out.println("not found");
        }
    }

    public void searchByAuthor(String author) {
        boolean check = true;
        for (Comic comic : comics) {
            if (comic.getAuthor().toLowerCase().contains(author)) {
                System.out.println(comic);
                check = false;
            }
        }
        if (check) {
            System.out.println("not found");
        }
    }

    public void displayByGenre() {
        for (int i = 1; i <= Genres.values().length; i++) {
            System.out.print(i + "." + " " + Genres.values()[i - 1] + "      ");
        }
        System.out.println("\n");
    }

    @Override
    public void edit(int id, Comic comic) {
        int index = findIndexById(id);
        comics.set(index, comic);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.comics.size(); i++) {
            if (this.comics.get(i).getComicId() == id)
                return i;
        }
        return -1;
    }

    @Override
    public List<Comic> getAll() {
        return comics;
    }

    public void getAvailableComic() {
        System.out.println("Here is the list of comic you can buy: ");
        for (Comic comic : comics) {
            if (comic.isAvailability()) {
                System.out.println(comic.getComicId() + ". " + comic.getTitle());
            }
        }
        System.out.println("\n");
    }

    public void checkGenre(String nameOfGenre) {
        boolean check = true;
        for (Comic comic : comics) {
            if (comic.getGenre().contains(nameOfGenre)) {
                System.out.println(comic);
                check = false;
            }
        }
        if (check) {
            System.out.println("This genre doesn't have any comic");
        }
    }

    public List<Genres> addGenre(int number) {
        genre.add(Genres.values()[number]);
        return genre;
    }


//    public void borrowComic(int number,int money) {
//        String buyComic = ListGenre.Genres.
//        for (Comic comic:comics) {
//        }
//    }
}
