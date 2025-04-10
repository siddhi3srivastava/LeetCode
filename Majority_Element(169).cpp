/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        //using Moore's voting algorithm
        int n=nums.size();
        int count=0;
        int find=0;
        for(int i=0; i<n; i++){
            if(count==0){
                find=nums[i];
                count=1;
            }
            else if(find==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        int check=0;
        for(int i=0; i<n; i++){
            if(nums[i]==find){
                check++;
            }
        }
        if(check>n/2){
            return find;
        }
        return -1;

    }
};
