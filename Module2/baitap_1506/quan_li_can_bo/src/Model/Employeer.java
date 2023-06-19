package Model;

public class Employeer extends Cadres {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employeer(String job) {
        this.job = job;
    }

    public Employeer(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "job='" + job + '\'' +
                '}';
    }
}
