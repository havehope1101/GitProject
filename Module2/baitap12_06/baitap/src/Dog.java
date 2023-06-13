public class Dog extends Animals {
    private String hairColor;
    private String dogType;

    @Override
    public void makeSound() {
        System.out.println("Woof- Woof");
    }
}
