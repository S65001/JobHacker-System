package org.example.task_2;

public class CheckPangram {
    public static boolean checkIfPangram(String sentence) {
        boolean[] letters =new boolean[26];

        int countOfLetters=0;
        for(int i=0;i<sentence.length();i++){
            int index='z'-sentence.charAt(i);
            if(!letters[index]) {
                countOfLetters++;
                letters[index]=true;
            }
        }
        if(countOfLetters==26)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String sentence="leetcode";
        System.out.println(checkIfPangram(sentence) );
    }
}
