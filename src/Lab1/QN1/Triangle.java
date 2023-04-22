package Lab1.QN1;
public class Triangle {
    private double s1, s2, s3;
    public Triangle(double side1, double side2, double side3) {
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
    }
    public double calculateArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}
