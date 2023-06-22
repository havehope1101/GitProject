package universityExam;

public class ClassStudent {
    private int number;
    private String name;
    private String address;
    private int priority;

    public ClassStudent() {
    }

    public ClassStudent(int number, String name, String address, int priority) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.priority = priority;
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
}
