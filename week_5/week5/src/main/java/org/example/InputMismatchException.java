package org.example;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        validInput();
    }
    static void validInput(){
        Scanner scanner=new Scanner(System.in);
        try {

            int a= scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println("sum="+(a+b));

        }catch (java.util.InputMismatchException e){
            System.out.println("you entered wrong input please enter input again:");
            validInput();
        }
        return;
    }
}