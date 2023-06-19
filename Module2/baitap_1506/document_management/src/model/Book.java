package model;

public class Book extends Document {

    private String nameAuthor;
    private int numberOfPage;

    public Book(int id, String name, String nameAuthor, int numberOfPage) {
        super(id, name);
        this.nameAuthor = nameAuthor;
        this.numberOfPage = numberOfPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
