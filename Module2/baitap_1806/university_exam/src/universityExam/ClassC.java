package universityExam;

import universityEntrance.UniversityEntrance;

public class ClassC extends ClassStudent implements UniversityEntrance {
    private char C;

    public ClassC(char c) {
        C = c;
    }

    public ClassC(int number, String name, String address, int priority, char c) {
        super(number, name, address, priority);
        C = c;
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
