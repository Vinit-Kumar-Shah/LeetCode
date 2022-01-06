import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length;
        while(start<end){
            int mid = (end+start)/2;
            if(target < nums[mid]){
                end = mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}