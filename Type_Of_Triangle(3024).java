/* You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

A triangle is called equilateral if it has all sides of equal length.
A triangle is called isosceles if it has exactly two sides of equal length.
A triangle is called scalene if all its sides are of different lengths.
Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.

 */

class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];

        if(a+b<=c || b+c<=a || c+a<=b){
            return "none";
        }

        else{
            if(a==b && b==c){
                return "equilateral";
            }
            else if(a==b || b==c || c==a){
                return "isosceles";
            }
            else{
                return "scalene";
            }
        }
    }
}
