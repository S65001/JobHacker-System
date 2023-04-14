package org.example;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int col=input.nextInt();
        char c=input.next().charAt(0);
        float sum=0f;
        float[][] matrix=new float[12][12];
        for(int i=0;i<12;i++){
            for (int j=0;j<12;j++){
                matrix[i][j]=input.nextFloat();
            }
        }
        for(int i=0;i<12;i++){
            sum+=matrix[i][col];
        }
        if(c=='S'){
            System.out.printf("%.1f%n",sum);
        }else{
            System.out.printf("%.1f%n",sum/12);
        }
    }
}
