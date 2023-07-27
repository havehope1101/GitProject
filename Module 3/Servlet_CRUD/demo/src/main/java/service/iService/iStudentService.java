package service.iService;

import java.util.List;

public interface iStudentService<E> {

  void add(E e);
    List<E> findAll();
    void delete(int id);
   int findById(int id);
    void edit(int id, E e);

}
