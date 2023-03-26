public class Main {
    public static void main(String[] args) {
        Area rectangle = new Area(23, 32);//for area of rectangle
        Area triangle = new Area(10, 15, 10);
        System.out.printf("Rectangle %.2f\n", rectangle.areaRectangle());
        System.out.printf("Triangle %.2f\n", triangle.areaTriangle());
    }
}