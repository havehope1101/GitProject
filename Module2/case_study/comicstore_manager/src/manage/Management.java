package manage;

import java.util.List;

public interface Management<E> {
    void add(E e);
    List<E> getAll();
    void delete(int id);
    void edit(int id, E e);
    int findIndexById(int id);

}
