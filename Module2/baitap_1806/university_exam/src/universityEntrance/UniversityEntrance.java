package universityEntrance;

import java.util.Iterator;

public interface UniversityEntrance<E> extends Iterator<E> {
    public void add(int index, E e);

    public E get(E e);

    public E search(int number, E e );

}
