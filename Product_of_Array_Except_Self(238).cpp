/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation. */

// time-complexity: O(n)
// space-complexity: O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        int n=nums.size();
        vector<int> ans(n,1);

        int prev=1;
        for(int i=0; i<n; i++){
            ans[i]=prev;
            prev=prev*nums[i];
        }

        int later=1;
        for(int i=n-1; i>=0; i--){
            ans[i]=ans[i]*later;
            later=later*nums[i];
        }

        return  ans;
        
    }
};
