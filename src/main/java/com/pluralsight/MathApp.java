package com.pluralsight;

public class MathApp {

    static void main() {

        // Q 1
        double bobSalary;
        double garySalary;
        double highestSalary;

        bobSalary= 59000;
        garySalary= 130000;
        highestSalary= Math.max(bobSalary,garySalary);
        System.out.println("Highest salary is :"+highestSalary);

        // Q 2
        double carPrice= 14000;
        double truckPrice = 31000;
        System.out.println("Min value is :"+Math.min(carPrice,truckPrice));

        // Q 3
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle is %.2f \n", area);

        // Q 4
        double num = 5.0;
        double result = Math.sqrt(num);
        System.out.printf("Square root of %.1f is %.4f \n", num, result);

        // Q 5
        double distance = Math.hypot(85 - 5, 50 - 10);
        System.out.printf("Distance between points is %.2f\n", distance);

        // Q 6
        System.out.println("Absolute value is " + Math.abs(-3.8));

        //Q 7
        System.out.printf("Random number: %.4f", Math.random());

        // Q 8
        System.out.println("Minutes: " + (24 * 24 * 60) + ", Milliseconds: " + (long)(24 * 24 * 60 * 60 * 1000));
    }
}
