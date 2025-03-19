/*Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.*/

class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                count++;
            }
        }
        if (count==0){
            return 0;
        }
        return sum/count;
        
    }
}
