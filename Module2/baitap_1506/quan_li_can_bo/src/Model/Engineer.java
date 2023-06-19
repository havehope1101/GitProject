package Model;

public class Engineer extends Cadres {
    private String train;

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public Engineer(String train) {
        this.train = train;
    }

    public Engineer(String name, int age, String gender, String address, String train) {
        super(name, age, gender, address);
        this.train = train;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "train='" + train + '\'' +
                '}';
    }
}
