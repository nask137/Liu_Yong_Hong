package project5;

public class Shape_Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.showArea();
        Square square = new Square(5);
        square.showArea();
        Circle circle = new Circle(3);
        circle.showArea();
    }
}
