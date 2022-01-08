class Solution {
    int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    boolean isEven(int num){
        int n = digits(num);
        return n % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int evens = 0;
        for(int num: nums){
            if(isEven(num)){
                evens++;
            }
        }
        return evens;
    }
}