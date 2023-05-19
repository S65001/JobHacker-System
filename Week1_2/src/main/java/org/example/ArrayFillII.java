package org.example;
import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<1000;i++){
            System.out.println("N["+i+"] = "+i%t);
        }
    }
}
