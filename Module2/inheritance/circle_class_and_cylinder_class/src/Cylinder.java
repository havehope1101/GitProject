public class Cylinder extends Circle {
    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        this.radius = radius;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
