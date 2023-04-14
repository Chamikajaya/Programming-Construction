public class Square extends Shape implements simpleCalculations {
    public Square(int length){
        super(length);
    }

    @Override
    public int find_area() {
        return getLength()* getLength();
    }

    @Override
    public int find_perimeter() {
        return 4 * getLength();
    }
}
