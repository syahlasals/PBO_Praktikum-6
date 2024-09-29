public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "\nA Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}