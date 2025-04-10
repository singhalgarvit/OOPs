package shape_area_calculator;

public class Main {
    public static void main(String[] args) {
        AreaCalculator ar = new AreaCalculator();
        Circle circle = new Circle();
        Square square = new Square();
        ar.area();
        System.out.println(circle.area(12));
        System.out.println(square.area(10,8));
    }
}