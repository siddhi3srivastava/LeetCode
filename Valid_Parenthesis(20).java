/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. */

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char curr= s.charAt(i);


            if(!st.isEmpty() && st.peek()==curr){
                st.pop();
            }
            else if(curr=='('){
                st.push(')');
            }
            else if(curr=='{'){
                st.push('}');
            }
            else if(curr=='['){
                st.push(']');
            } 
            else{
                return false;
            } 
        }
        return st.isEmpty();
    }
}
