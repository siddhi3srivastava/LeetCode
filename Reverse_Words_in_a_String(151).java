/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.*/

// time complexity: O(n)

class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");  //using this to eliminate spaces more than 1, other than just s.split(" ")
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            String temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return String.join(" ", arr);
        
    }
}   
