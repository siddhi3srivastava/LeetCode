/* There is a forest with an unknown number of rabbits. We asked n rabbits "How many rabbits have the same color as you?" and collected the answers in an integer array answers where answers[i] is the answer of the ith rabbit.

Given the array answers, return the minimum number of rabbits that could be in the forest.*/

//time complexity: O(N)

class Solution {
    public int numRabbits(int[] answers) {

        int finalSum=0;
       HashMap<Integer, Integer> map= new HashMap<>();

       for(int i=0; i<answers.length; i++){
            int key=answers[i];
            map.put(key, map.getOrDefault(key, 0)+1);

       }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        int sum = 0;
        for (int j = 0; j < keys.size(); j++) {
            if(keys.get(j)>0){
                sum += keys.get(j);
            }
            else{
                sum+=1;
            }
            
        }

        finalSum=sum+map.size();
        return finalSum;
    }
    
    
}
