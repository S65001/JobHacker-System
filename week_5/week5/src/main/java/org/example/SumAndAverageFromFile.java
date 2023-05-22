package org.example;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SumAndAverageFromFile {
    public static void main(String[] args) {
        try {
            URL url =new URL( "http://liveexample.pearsoncmg.com/data/Scores.txt");
            File file=readFromWebToFile(url);
            System.out.println("the sum is: "+getSum(file));
            System.out.println("the average is: "+getAverage(file));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static File readFromWebToFile(URL url) throws IOException {
        URLConnection urlConnection= url.openConnection();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader( urlConnection.getInputStream()));
        String webLine;
        File file= new File("Scores.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
        while((webLine=bufferedReader.readLine())!=null){
           bufferedWriter.write(webLine);
           bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        return file;
    }
    static int getSum(File scores) throws IOException {
        int sum=0;
        BufferedReader buffer=new BufferedReader(new FileReader(scores));
        String line;
        while((line= buffer.readLine())!=null){
            String [] numbers=line.split(" ");
            for(String number:numbers){
                sum+=Integer.parseInt(number);
            }
        }
        return sum;
    }
    static int getAverage(File scores) throws IOException {
        int count=0;
        BufferedReader buffer=new BufferedReader(new FileReader(scores));
        String line;
        while((line= buffer.readLine())!=null){
            if(!line.isEmpty()) {
                String[] numbers = line.split(" ");
                count += numbers.length;
            }
        }
        int sum=getSum(scores);
        return sum/count;
    }
}
