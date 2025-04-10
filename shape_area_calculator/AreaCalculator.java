package shape_area_calculator;

public class AreaCalculator {
    final double pi = 3.14;

    public void area(){
        System.out.println("This is area method");
    }
}

class Circle extends AreaCalculator{
    public double area(int r){
        return pi*r*r;
    }
}

class Square extends AreaCalculator{
    public double area(int a,int b){
        return a*b;
    }
}