package universityExam;

import universityEntrance.UniversityEntrance;

public class ClassB extends ClassStudent implements UniversityEntrance {
    private char B;

    public ClassB(char b) {
        B = b;
    }

    public ClassB(int number, String name, String address, int priority, char b) {
        super(number, name, address, priority);
        B = b;
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
