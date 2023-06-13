import java.util.Scanner;

public class Animals {

    private int idAnimals;
    private String name;
    private int years;
    private static int count=0;

    public Animals() {
    }

    public Animals(String name, int years) {

        this.idAnimals = ++count;
        this.name = name;
        this.years = years;
    }

    @Override
    public String toString() {
        return "id: "+idAnimals + " name: "+ name + " years: " + years;
    }

    public void makeSound() {
    }

    public void addAnimal() {
        System.out.println("ban muon them con gi:" );
        System.out.println("1. Cho");
        System.out.println("2. Meo");
        System.out.println("3. Chim");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt()==1) {

        }
    }
}
