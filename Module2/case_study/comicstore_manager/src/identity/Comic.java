package identity;

import java.util.ArrayList;

public class Comic {
    private int comicId;
    private String title;
    private String author;
    private ArrayList<String> genre;
    private boolean availability;

    public Comic() {
    }

    public Comic(int comicId, String title, String author, ArrayList<String> genre, boolean availability) {
        this.comicId = comicId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public int getComicId() {
        return comicId;
    }

    public void setComicId(int comicId) {
        this.comicId = comicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
