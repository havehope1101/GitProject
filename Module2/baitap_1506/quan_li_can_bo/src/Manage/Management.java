package Manage;

public interface Management<E> {
    void add(E e);
    E findByName(String name);
    E[] showAll();
}
