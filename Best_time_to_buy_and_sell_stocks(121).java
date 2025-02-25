class Solution{
  public int maxProfit(int[] prices){
    int len=prices.length;
    int profit=0;
    int min=Integer.MAX_VALUE;
    for(int i=0; i<len; i++){
      if(profit[i]<min){
        min=profit[i];
      }
      profit=Math.max(profit, profit[i]-min);
    }
     return profit;
  }
}


// here, adding the "profit=Math.max(profit, profit[i]-min);" under the else block optimizes the solution

/*The else block ensures that profit calculation only happens when prices[i] is greater than or equal to minPrice.
  But since profit calculation (prices[i] - minPrice) already results in 0 when prices[i] == minPrice, the program works fine without else too.*/
