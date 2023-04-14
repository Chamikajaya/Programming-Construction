public class Main {
    public static void main(String[] args) {
        Square obj1 = new Square(12);
        System.out.println("Area -> " + obj1.find_area() + ",  Perimeter -> " + obj1.find_perimeter());

        Rectangle obj2= new Rectangle(10, 8);
        System.out.println("Area -> " + obj2.find_area() + ",  Perimeter -> " + obj2.find_perimeter());

    }
}