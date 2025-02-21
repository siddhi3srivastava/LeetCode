//Here is the code of kids with greatest number of candies in c++

class Solution{
public:
  vector<bool> kidsWithCandies(vector<int>& candies, int extra){
    int l=candies.size();
    vector<bool>arr;
    int maxi=INT_MIN;
    for(int i=0; i<l; i++){
      maxi=max(candies[i], maxi);
    }
    for(int i=0; i<l; i++){
      if(candies[i]+extra<maxi){
        arr.push_back(false);
      }
      else{
        arr.push_back(true);
      }
    }
    return arr;
  }
};
    
