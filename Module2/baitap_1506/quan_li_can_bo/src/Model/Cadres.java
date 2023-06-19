package Model;

public class Cadres {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Cadres() {
    }

    public Cadres(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Model.Cadres{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
