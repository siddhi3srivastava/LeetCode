/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the 
characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_trav=0;
        int t_trav=0;
        while(s_trav<s.length() && t_trav<t.length()){
            if(s.charAt(s_trav)==t.charAt(t_trav)){
                s_trav++;
            }
            t_trav++;
        }
        if(s_trav==s.length()){
            return true;
        }
        return false;
    }
}

 
