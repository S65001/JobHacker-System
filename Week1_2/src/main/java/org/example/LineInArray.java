package org.example;
import java.util.Scanner;


public class LineInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int line=input.nextInt();
        char c=input.next().charAt(0);
        float sum=0f;
        float[][] matrix=new float[12][12];
        for(int i=0;i<12;i++){
            for (int j=0;j<12;j++){
                matrix[i][j]=input.nextFloat();
            }
        }
        for(int i=0;i<12;i++){
            sum+=matrix[line][i];
        }
        if(c=='S'){
            System.out.println(sum);
        }else{
            System.out.println(sum/12);
        }
    }
}
