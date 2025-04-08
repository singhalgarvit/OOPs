package Simple_Calculator;

public class Calculator {
    int x;
    int y;

    public Calculator(int a,int b){     //This is the Constructor
        x = a;
        y = b;
    }

    //These are the methods

    public int add(){
        return x+y;
    }
    public int subtract(){
        return x-y;
    }
    public int multiply(){
        return x*y;
    }
    public int divide(){
        return x/y;
    }
}
