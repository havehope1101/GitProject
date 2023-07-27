package management;

import java.util.List;

public interface Management<E> {
    void add(E e);
    List<E> getAll();
    void delete(String id);
    void edit(String id, E e);
    int findIndexById(String id);

}
