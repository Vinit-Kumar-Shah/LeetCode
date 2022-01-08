class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;
        for(int num: nums){
            if((""+num).length() % 2 == 0){
                evens++;
            }
        }
        return evens;
    }
}