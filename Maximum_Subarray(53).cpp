/* Given an integer array nums, find the subarray with the largest sum, and return its sum. */

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        int maximum=INT_MIN;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];

            if(sum>maximum){
                maximum=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return maximum;
    }
};
