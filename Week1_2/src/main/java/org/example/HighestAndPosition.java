package org.example;
import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int index=0,number=-1;
        for (int i=0;i<100;i++){
            int x= input.nextInt();
            if(x>number){
                index=i+1;
                number=x;
            }
        }
        System.out.println(number);
        System.out.println(index);
    }
}