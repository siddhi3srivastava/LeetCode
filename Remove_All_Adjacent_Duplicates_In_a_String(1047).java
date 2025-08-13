/* You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique. */

class Solution {
    public String removeDuplicates(String s) {
        int len=s.length();
        Stack<Character> st= new Stack<>();
        for(int i=0; i<len; i++){
            char curr=s.charAt(i);
            if(st.isEmpty()){
                st.push(curr);
            }
            else if(st.peek()==curr){
                st.pop();
            }
            else{
                st.push(curr);
            }
        }
       
       StringBuilder str= new StringBuilder();
       while(!st.isEmpty()){
        char ch=st.pop();
        str.append(ch);
       }

       return str.reverse().toString();
    }
}
