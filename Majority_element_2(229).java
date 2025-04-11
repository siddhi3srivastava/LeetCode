/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.*/

//time-complexity: O(n)
//spcae-complexity:O(n)

// optimal approach by using hashmap 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>(n/3) && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }    
        }
        return ans;
        
    }
}
