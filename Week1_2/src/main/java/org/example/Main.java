package org.example;

import java.util.Arrays;



public class Main {
    public  static String longestCommonPrefix(String[] strs) {
        String output = "";
        Arrays.sort(strs);
        int size = strs.length;
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isCommon = true;
            for (int j = 1; j < size; j++)
                if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
                    isCommon = false;
                    break;
                }
               if(isCommon)
                   output=strs[0].substring(0,i);
               else
                   break;
            }
          return output;
        }

    public static void main(String[] args) {
        String[] input={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }
}