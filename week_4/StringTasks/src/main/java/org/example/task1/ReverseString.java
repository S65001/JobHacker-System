package org.example.task1;



public class ReverseString {
    public static void main(String[] args) {
        reverse("hello world");
        System.out.println();
        reverse("rose are\t red ");
    }
    public static void reverse(String word){
        int length=word.length();
        for(int i=length;i>0;i--){
            System.out.print(word.charAt(i-1));
        }
    }
}
