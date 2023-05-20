package org.example.task2;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ele"));
        System.out.println(isPalindrome("len nel"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("elen"));
        System.out.println(isPalindrome("hello hollo"));
        System.out.println(isPalindrome("hiy ih"));

    }
    public static boolean isPalindrome(String string){
        boolean palindrome=true;
        int l=string.length();
        for(int i=0;i<l/2;i++){
            if(string.charAt(i)!=string.charAt(l-i-1)){
                palindrome=false;
                break;
            }
        }
        return palindrome;
    }
}
