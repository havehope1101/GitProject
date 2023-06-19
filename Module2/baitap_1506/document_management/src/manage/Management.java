package manage;

import java.util.List;

public interface Management<E> {
    void add(E e);

    void delete(int id);

    int findIndexById(int id);

    void edit(int id, E e);

    List<E> findAll();
}
