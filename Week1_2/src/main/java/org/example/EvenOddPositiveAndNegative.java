package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        int pos=0;
        int neg=0;
        Scanner input = new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();
        for (int i=0;i<5;i++) {
            numbers.add(input.nextInt());
        }
        for (Integer x:numbers) {

            if(x%2==0){
                even++;
            }else{
                odd++;
            }
            if(x>0){
                pos++;
            }else if(x<0){
                neg++;
            }
        }
        System.out.println(even+" valor(es) par(es)\n"
                + odd+ " valor(es) impar(es)\n"
                + pos +" valor(es) positivo(s)\n"
                + neg + " valor(es) negativo(s)");
    }
}
