package org.example.task_2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[][] indexContainer=new int[nums.length][2];
        int x=0,y=0;
        boolean isHead=false,isTail=false;

        //TODO: saving indices of all the elements before sorting
        for(int i=0;i<nums.length;i++)
        {
            indexContainer[i][0]=nums[i];
            indexContainer[i][1]=i;
        }
        Arrays.sort(nums);
        int head=0,tail= nums.length-1;

        //  TODO: trying to find the target by sorting the numbers
        //  TODO: and applying two pointers <head> and <tail>

        while((nums[head]+nums[tail]) !=target)
        {
            if(nums[head]+nums[tail]>target){
                tail--;
            }else{
                head++;
            }
        }
        // TODO: searching for the index of <head> and <tail> before sorting
        for(int i=0;i<nums.length;i++)
        {
            if((indexContainer[i][0]==nums[head]) &&!isHead){
                isHead=true;
                x=indexContainer[i][1];
            }else if((indexContainer[i][0]==nums[tail])&&!isTail){
                isTail=true;
                y=indexContainer[i][1];
            }
        }

         return new int[]{x,y};
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,11};
        System.out.println(twoSum(arr, 10));
    }
}
