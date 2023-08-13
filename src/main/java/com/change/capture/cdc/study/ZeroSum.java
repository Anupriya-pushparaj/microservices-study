package com.change.capture.cdc.study;
import java.util.Set;
import java.util.HashSet;

public class ZeroSum {


    public static boolean hasZeroSumSubarray(int[] nums) {
       Set<Integer> set = new HashSet<>();
       set.add(0);

       int sum=0;
       for(int values:nums)
           sum = sum+values;
       if(set.contains(sum)){
           return true;
       }
        set.add(sum);

       return false;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        if (hasZeroSumSubarray(nums)) {
            System.out.println("Subarray exists");
        }
        else {
            System.out.println("Subarray does not exist");
        }
    }
}
