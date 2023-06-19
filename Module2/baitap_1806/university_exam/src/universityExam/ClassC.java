package universityExam;

public class ClassC {
    private int number;
    private String name;
    private String address;
    private int priority;
    private char subject = 'C';

    public ClassC() {
    }

    public ClassC(int number, String name, String address, int priority, char subject) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.subject = subject;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public char getSubject() {
        return subject;
    }

    public void setSubject(char subject) {
        this.subject = subject;
    }
}
