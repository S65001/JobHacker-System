package org.example;
import java.util.Scanner;

public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        for(int i=1;i<=number;i++) {
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}

