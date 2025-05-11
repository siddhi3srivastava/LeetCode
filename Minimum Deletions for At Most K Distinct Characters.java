//Leetcide weekly contest 449
//Q1

/*You are given a string s consisting of lowercase English letters, and an integer k.

Your task is to delete some (possibly none) of the characters in the string so that the number of distinct characters in the resulting string is at most k.

Return the minimum number of deletions required to achieve this.©leetcode*/

class Solution {
    public int minDeletion(String s, int k) {
        int len=s.length();
        int del=0;
        HashMap <Character, Integer>map= new HashMap<>();

        for(int i=0; i<len; i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        if(map.size()<=k){
          return 0;
        }
        List<Integer> freq= new ArrayList<>(map.values());
        Collections.sort(freq);

        int f_len=freq.size();
        int index=0;
        while(f_len>k){
            del=del+freq.get(index);
            index++;
            f_len--;
        }
        return del;
    }
}©leetcode
