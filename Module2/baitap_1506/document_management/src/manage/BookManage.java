package manage;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManage implements Management<Book> {
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        books.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0 ; i< books.size(); i++) {
            if(books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Book book) {
        int index = findIndexById(id);
        books.set(index, book);
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

}
