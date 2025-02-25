//C++ solution to the leetcode question 121

//Using else block which reduces runtime


class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int len=prices.size();
        int minimum=INT_MAX;
        int profit=0;
        for(int i=0; i<len; i++){
            if(prices[i]<minimum){
                minimum=prices[i];
            }
            else{ 
            profit=max(profit, prices[i]-minimum);
            }
            
        }
        return profit;

    }
};
