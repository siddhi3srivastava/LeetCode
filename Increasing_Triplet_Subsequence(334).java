/* Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false. */

//time-complexity: O(N)

class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n= nums.length;
        int[] arr1= new int[n];
        int[] arr2= new int[n];

        int min= nums[0];
        int max= nums[n-1];

        for(int i=1; i<n; i++){
            min=Math.min(min, nums[i-1]);
            arr1[i]=min;
        }

        for(int i=n-2; i>=0; i--){
            max=Math.max(max, nums[i+1]);
            arr2[i]=max;

        }

        for(int i=1; i<n-1; i++){
            if(nums[i]>arr1[i] && nums[i]<arr2[i]){
                return true;
            }
            
        } 

        return false;
    }
}
    
