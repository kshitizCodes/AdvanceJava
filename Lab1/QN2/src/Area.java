public class Area {
    private double length, breadth, s1, s2, s3;
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Area(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public double areaRectangle() {
        return length * breadth;
    }
    public double areaTriangle() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}
