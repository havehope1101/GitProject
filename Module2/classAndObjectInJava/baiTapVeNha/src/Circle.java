public class Circle {
    private static int id;
    private double radius;
    private static final double PI = 3.14;
    private static int number;
    public static double tongDienTich;
    public static double maxR = 0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        if(radius>maxR) {
            maxR = radius;
        }
    }

    public static int getId() { return id; }

    public static void setId(int id) {
        Circle.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "id: " +id++ + " radius: " + radius ;
    }

    public double tinhChuVi() {
        System.out.println("chu vi hinh tron la: "+ 2*PI*radius);
        return 2*PI*radius;
    }

    public double tinhDienTich() {
        System.out.println("dien tich hinh tron la: "+ 2*PI*radius);
        tongDienTich += PI*this.radius*radius;
        return PI*radius*radius;
    }

    public static String tinhTongDientich() {
        return "Tong dien tich la: "+ tongDienTich;
    }

    public Object findCircleWithMaxR() {
        if(Circle.this.radius==maxR) {
            return "Hinh tron co ban kinh lon nhat la: " + Circle.id;
        }
        return "Hinh tron co ban kinh lon nhat la: " + Circle.id;
    }
}
