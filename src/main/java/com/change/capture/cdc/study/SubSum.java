package com.change.capture.cdc.study;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubSum {
    public static void subarray(int[] nums)
    {
        for (int i=0; i< nums.length; i++)  {
            int sum=0;
            for(int j=i; j<nums.length; j++){
             sum=sum+nums[j];
             if(sum==0){
                 System.out.println("Subarray[" + i + "…" + j + "]");
             }


            }
        }


    }



    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        subarray(nums);
    }



}
