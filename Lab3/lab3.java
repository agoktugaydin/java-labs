
package com.mycompany.lab3;
import java.util.Scanner;
//import java.lang.Math;

public class lab3 {
    static void circle(){
        System.out.println("enter the radius value: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("circumference value: " + 2*Math.PI*radius );
        System.out.println("area of circle: " + Math.PI*radius*radius);
    }
    
    static void mathematicalOperations(){
        double x = 1.2;
        double y = 14;
        double result1 = ((3*x)+(7/y))*((3*x)+(7/y));
        System.out.println("result 1: "+result1);  
        double a = 6;
        double b = 4;
        double result2 = ((a*a)+2*b)/((b*b)/2);
        System.out.println("result 2: "+result2);
    }
    
    
    public static void main(String[] args) {

        System.out.println("1. find the circumference and area of the circle: ");
        System.out.println("2. perform the mathematical operations: ");
        System.out.println("3. exit");
        System.out.println();
        System.out.println("Select the action you want to do: ");
        
        int options;
        Scanner keyboard = new Scanner(System.in); // Capturing the input
        options = keyboard.nextInt();
        
        switch (options) {
            case 1:
                circle();
                break;
            case 2:
                mathematicalOperations();
                break;
            case 3:
                break;
        }
    }
}

