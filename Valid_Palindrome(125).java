/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/

//time complexity: O(n/2)
//space complexity: O(1);

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char first=s.charAt(left);
            char last=s.charAt(right);
            if(!Character.isLetterOrDigit(first)){
                left++;
            }
            else if(!Character.isLetterOrDigit(last)){
                right--;
            }
            else if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
