// The program is to find the gcd of two strings
// Time complexity O(n)
// Space complexity O(n)

public class Solution{
  public String GCD(String str1, String str2){
    if(str1.length()<str2.length()){
      return GCD(str2, str1); //------->ensures that the first string is always the longer one, so str1 is always the longer string
    }
    else if(!str1.startsWith(str2)){
      return "";
    }  
    else if(str2.isEmpty(){
      return str1; //-------->according to euclid gcd algorithm, GDC(a,0)=a
    }
    else{
      return(GCD(str1.substring(str2.length()), str2); //------->removes the first matching half of the longer string(str1), so the rest of the string is now compared to str2 in the next iteration
    }
  }
}

//the same code is uploaded in c++ in the leetcode folder 
