package com.change.capture.cdc.study;

public class Maximum {

      public static void maxArray(int[] nums, int s) {

          int len=0;
          int end=0;
          for(int i=0;i<nums.length;i++) {
              int target=0;

              for(int j=i;j<nums.length;j++) {

                target=target+nums[j];
                 if(target==s){
                     if(len<j-i+1){
                         len=j-i+1;
                         end=j;
                     }



                 }
              }

          }

       System.out.println("Maximum Subarray:"+(end-len+1)+","+end);





      }



    public static void main (String[] args)
    {
        //int[] nums = {  5, 6, -5, 5, 3, 5, 3, -2, 0 };

        //int[] nums = { 2, 3, 5, 2, 1 };
        int[] nums={2,3,5,2,1,5,1};
        int s = 7;
        maxArray(nums,s);
    }


}
