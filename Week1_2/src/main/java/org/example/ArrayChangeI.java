package org.example;
import java.util.Scanner;
import java.util.Stack;

public class ArrayChangeI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Integer>s=new Stack<>();
        for(int i=1;i<=20;i++) {
            s.push(input.nextInt());
        }
        for (int i=0;i<20;i++){
            System.out.println("N["+i+"] = "+s.pop());
        }
    }
}

