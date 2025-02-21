//candies is the array that contains the number of candies each kid has
//candies[i]=no. of candies each ith kid has
class Solution{
  public List<Boolean> kids(int[]candies, int extra){
    int l=candies.length;
    List<Boolean> arr=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    for(int i=0; i<l; i++){
      max=Math.max(max, candies[i]);
    }
    for(int i=0; i<l; i++){
      if(candies[i]+extra<max){
        arr.add(false);
      }
      else{
        arr.add(true);
      }
    }
    return arr;
  }
}
