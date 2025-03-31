/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/

// time complexity: O(N)
// space complexity: O(N)

class Solution {

    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {

        int start=0;
        int end=s.length()-1;
        char ch[]=s.toCharArray();
        while(start<end){
        
            if(!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
    }
    return String.valueOf(ch);
    }

}
