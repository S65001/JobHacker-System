package org.example;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {


        int [] banknotes ={100,50,20,10,5,2,1};
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(n);
        for(int i=0;i<banknotes.length;i++)
        {
            int x=n/banknotes[i];
            n=n%banknotes[i];
            //5 nota(s) de R$ 100,00
            System.out.println(x+" nota(s) de R$ "+banknotes[i]+",00");
        }

    }
}
