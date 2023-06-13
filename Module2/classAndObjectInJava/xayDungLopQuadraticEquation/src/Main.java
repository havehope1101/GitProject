import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao gia tri cua b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao gia tri cua c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());

        } else if(quadraticEquation.getDiscriminant()==0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        } else {
            System.out.println("the equation has no real roots");
        }
        System.out.println(Math.floor((Math.random() * 100000)));
    }

}
