class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int[] count = new int[101]; 
        
        for (int num : nums) {
            goodPairs += count[num];  
            count[num]++;
        }
        
        return goodPairs;
    }
}
