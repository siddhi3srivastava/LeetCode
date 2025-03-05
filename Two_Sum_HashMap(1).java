class Solution{
  public int[] twoSum(int[]nums, int target){
    Map<Integer, Integer> map=new HashMap<>();
    int len=nums.length;
    for(int i=0; i<len; i++){
      int need=target-nums[i];
      if(map.containsKey(need)){
        return new int[]{map.get(need), i};
      }
      map.put(nums[i],i);
    }
    return new int[]{};
  }
}
