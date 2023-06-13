import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(22);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());

        circle1.tinhDienTich();
        circle1.tinhChuVi();

        Circle.tinhTongDientich();
    }
}
