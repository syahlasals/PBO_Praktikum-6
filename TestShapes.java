public class TestShapes {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("\nShape1"
        + "\nColor : " + shape1.getColor() 
        + "\nShape : " + shape1.getFilled() 
        + "\nFilled : " + shape1.toString());

        Shape shape2 = new Shape("merah", false);
        System.out.println("\nShape2"
        + "\nColor : " + shape2.getColor() 
        + "\nShape : " + shape2.getFilled() 
        + "\nFilled : " + shape2.toString());

        Circle circle = new Circle(2.5);
        System.out.println("\nCircle");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println("\nRectangle"); 
        System.out.println("Area : " + rectangle.getArea()); 
        System.out.println("Perimeter : " + rectangle.getPerimeter()); 
        System.out.println(rectangle.toString());

        Square square = new Square(5.0);
        System.out.println("\nSquare"); 
        System.out.println("Area : " + square.getArea()); 
        System.out.println("Perimeter : " + square.getPerimeter());
        System.out.println(square.toString());

    }
}