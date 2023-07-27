package identity;

import java.io.Serializable;
import java.util.ArrayList;

public class Comic implements Serializable {
    private int comicId;
    private String title;
    private String author;
    private ArrayList<String> genre;
    private boolean availability;
    private int value;

    public Comic() {
    }

    public Comic(int comicId, String title, String author, ArrayList<String> genre, boolean availability, int value) {
        this.comicId = comicId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
        this.value = value;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "comicId: " + comicId +
                        ", title: '" + title + '\'' +
                        ", author: '" + author + '\'' + "\n" +
                        ", genre: " + genre +
                        ", availability: " + availability +
                        ", value: " + value;
    }

    public String toStringOnlyTitle() {
        return comicId + ". " + title;
    }
}
