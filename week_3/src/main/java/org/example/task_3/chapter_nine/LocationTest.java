package org.example.task_3.chapter_nine;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double[][] arr = new double[row][column];

        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }
        Location location=locateLargest(arr);
        System.out.println("The location of the largest element is "
                           + location.getMaxValue() + " at (" + location.getRow()
                           + ", " + location.getColumn() + ")");

    }
    public static Location locateLargest(double[][] a){
        int x=0,y=0;
        double max=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               if(a[i][j]>max){
                   max=a[i][j];
                   x=i;
                   y=j;
               }
            }
        }
        return new Location(x,y,max);
    }
}
