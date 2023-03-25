public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.printf("Area of rectangle %.2f\n", rectangle.calculateArea());
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.printf("Area of triangle %.2f", triangle.calculateArea());
    }
}