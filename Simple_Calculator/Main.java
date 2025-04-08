package Simple_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        Calculator clc = new Calculator(x,y); //This is the call of constructor
        
        System.out.println(clc.add());
        System.out.println(clc.subtract());
        System.out.println(clc.multiply());
        System.out.println(clc.divide());
    }
}