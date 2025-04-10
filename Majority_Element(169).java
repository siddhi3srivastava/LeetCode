/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

//time-complexity: O(n)
//space-complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int i=0;
        int count=1;
        for(int j=1; j<nums.length; j++){
            if (nums[i]==nums[j]){
                count+=1;
            }
            else{
                count-=1;
            }
            if (count==0){
                i=j;
                count=1;
            }
            
        }
        return nums[i];
    }
}
