package org.example.task_3.chapter_nine;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        //TODO:generate 100,000 int
        int [] array=new int[100000];
        for(int i=0;i<100000;i++){
            array[i]=(int)(Math.random()*10000);
        }

        //TODO:measure the execution time
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();

        System.out.println("The execution time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
    public static void selectionSort(int[] arr){

        for(int j=0;j< arr.length;j++) {
            int minIndex=j;
            int min=arr[minIndex];
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex]=arr[j];
            arr[j]=min;
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
