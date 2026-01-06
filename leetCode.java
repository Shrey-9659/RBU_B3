// Question : 905
class Solution {
    void partition(int[] nums, int low, int high){
        while(low < high){
            while((low < high) && nums[low] % 2 == 0){
                low++;
            }
            while((low < high) && nums[high] % 2 != 0){
                high--;
            }
            if(low < high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }
        }
    }
    public int[] sortArrayByParity(int[] nums) {
        partition(nums, 0, nums.length -1);
        return nums;
    }
}