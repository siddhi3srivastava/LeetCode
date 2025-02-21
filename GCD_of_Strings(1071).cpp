// GCD of two strings in C++

class Solution{
  public:
    string GCD(string str1, string str2){
      if(str1.length()<str2.length()){
        return GCD(str2, str1);
      }
      else if(str1.rfind(str2,0)!=0){
        return "";
      }
      else if(str2.empty()){
        return str1;
      }
      else{
        return GCD(str1.substr(str2.length()), str2);
      }      
   }
};
