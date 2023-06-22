package universityExam;

import universityEntrance.UniversityEntrance;

public class ClassA extends ClassStudent implements UniversityEntrance{
   private char A;

    public ClassA(char a) {
        A = a;
    }

    public ClassA(int number, String name, String address, int priority, char a) {
        super(number, name, address, priority);
        A = a;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public Object search(int number, Object o) {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
