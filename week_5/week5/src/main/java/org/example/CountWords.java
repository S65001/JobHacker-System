package org.example;


import java.io.*;

public class CountWords {
    public static void main(String[] args) {
        int cnt=0;

        try {
            FileReader fileReader=new FileReader("Lincoln.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                if (!line.isEmpty()) {
                    String[] words = line.split(" ");
                    for(String word:words) {
                        if (validate(word))
                           cnt ++;
                    }
                }
            }
            bufferedReader.close();
            System.out.println(cnt);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static boolean validate(String word){
        return !word.equals("--");
    }
}
