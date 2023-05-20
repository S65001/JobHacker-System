package org.example.bonus_task;

import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {

        System.out.println(countUsingSubstring("can you can a can as caner can a can can you? yes i can","can"));
        System.out.println(countUsingTokenizer("can you can a can as caner can a can can you? yes i can","can"));
        System.out.println(countUsingSplit("can you can a can as caner can a can can you? yes i can","can"));
        System.out.println(countUsingIndex("can you can a can as caner can a can can you? yes i can","can"));
    }

    public static int countUsingSplit(String phrase,String word){
        int count=0;
        String arr[]=phrase.split(" ");
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(word))
                count++;
        }
        return count;
    }
    public static int countUsingSubstring(String phrase,String word){
        int count=0;
        int l=word.length();
        for(int i=1;i<phrase.length()-l-1;i++){
            String string=phrase.substring(i,i+l);
            if(phrase.charAt(i-1)==' ' && string.equals(word) && phrase.charAt(i+l)==' ')
                count++;
        }
       /*  checking the first and last word separately as the first word doesn't have
         space before it and the last word doesn't have space after it */
        if((phrase.substring(0,l).equals(word) &&phrase.charAt(l)==' ' ))
            count++;
        if( (phrase.substring(phrase.length()-l).equals(word) && phrase.charAt(phrase.length()-l-1)==' '))
            count++;
        return count;
    }
    public static int countUsingTokenizer(String phrase,String word){
        int count=0;
        StringTokenizer stringTokenizer=new StringTokenizer(phrase);
        while(stringTokenizer.hasMoreTokens()){
            if(stringTokenizer.nextToken(" ").equals(word)){
                count++;
            }
        }
        return count;
    }


    //this method used to find sequence of characters in string
    public static int countUsingIndex(String phrase, String word){
        int count=0;
        int start=0;
        int l=word.length();
        while(phrase.indexOf(word,start)>=0){
                count++;

            // TODO: search in string starting from the last position of the word
            start= phrase.indexOf(word,start)+l;
        }
        return count;
    }

}
