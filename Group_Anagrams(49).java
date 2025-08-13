/* Given an array of strings strs, group the anagrams together. You can return the answer in any order. */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map= new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str=strs[i];
            char[] arr= str.toCharArray();
            Arrays.sort(arr);
            String word= new String(arr);

            if(!map.containsKey(word)){
                List<String> wordList= new ArrayList<>();
                map.put(word, wordList);
            }
            map.get(word).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
