package org.example;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1= input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        double distance =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.4f%n", distance);

    }
}