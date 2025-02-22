class Solution{
  public String MergeAlternatively(String str1, String str2){
    int len1=str1.length();
    int len2=str2.length();
    int l=len1+len2;
    int []arr=new char[l];
    int j=0;
    int k=0;
    for(int i=0; i<j; i++){
      if (i%2==0 && j<len1){
        arr[i]=str1.charAt[i];
        j+=1;
      }
      else if(i%2==1 && k<len2){
        arr[i]=str2.charAt[i];
        k+=1;
      }
    }
    while(j<len1){
      arr[k+j]=str1.charAt[j];
      j+=1;
    }
    while(k<len2){
      arr[k+j]=str2.charAt[k];
      k+=1;
    }
    
        
    
    
    
