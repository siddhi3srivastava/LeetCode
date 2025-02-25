//using both O(n^2) and hashmap

class solution{
  public boolean containsNearbyDuplicates(int[]nums, int k){
    Hashmap<Integer, Integer> map= new HashMap<>();
    int n=nums.length;
    for(int i=0; i<n; i++){
      if(map.contains(nums[i])){
        int index=map.get(nums[i]);
        if(i-index<=k){
          return true;
        }
      }
      map.put(nums[i], i);
    }
    return false;
  }
}

//O(n^2) approach
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             int diff=Math.abs(i-j);
        //             if(diff<=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
