package org.example;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args){
        double r,area;
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        area = 3.14159 * r* r;
        System.out.printf("A=%.4f\n",  area);
    }
}
