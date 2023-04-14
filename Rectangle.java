public class Rectangle extends Shape implements simpleCalculations {
    public Rectangle(int length, int width){
        super(length, width);
    }

    @Override
    public int find_perimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public int find_area() {
        return getLength() * getWidth();
    }
}
