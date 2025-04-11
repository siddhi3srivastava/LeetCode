/*Given an array nums, you can perform the following operation any number of times:

Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
Replace the pair with their sum.
Return the minimum number of operations needed to make the array non-decreasing.

An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).*/

// time-complexity: O(n^2)
// space-complexity: O(1)

class Solution {
public:
    int minimumPairRemoval(vector<int>& nums) {
        int n= nums.size();
        int count=0;
       
        while(n>1){
            bool check=true;
            int maximum=INT_MAX;
            int index=-1;
            for(int i=0; i<n-1; i++){
                if(nums[i]>nums[i+1]){
                    check=false;
                }
                if(nums[i]+nums[i+1]<maximum){
                    maximum=nums[i]+nums[i+1];
                    index=i;
                }
            }
            if(check){
                break;
            }
            nums[index]=maximum;

            for(int i=index+1; i<n-1; i++){
                nums[i]=nums[i+1];
            }
            n--;
            count++;

        }
        return count;
        
    }
};
