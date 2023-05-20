package org.example.task_3.chapter_eleven;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1,side2,side3;
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        Triangle triangle=new Triangle(side1,side2,side3);
        System.out.print("Enter a triangle color: ");
        String color = input.next();
        triangle.setColor(color);
        System.out.print("Is the triangle filled:(y/n)");
        String isFilledString = input.next();
        boolean Filled = (isFilledString.equals("y"));
        triangle.setFilled(Filled);

        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Color = " + triangle.getColor());
        System.out.println("Is filled? " + triangle.isFilled());


    }
}
