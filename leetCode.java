// Question : 905
// class Solution {
//     void partition(int[] nums, int low, int high){
//         while(low < high){
//             while((low < high) && nums[low] % 2 == 0){
//                 low++;
//             }
//             while((low < high) && nums[high] % 2 != 0){
//                 high--;
//             }
//             if(low < high){
//                 int temp = nums[low];
//                 nums[low] = nums[high];
//                 nums[high] = temp;
//             }
//         }
//     }
//     public int[] sortArrayByParity(int[] nums) {
//         partition(nums, 0, nums.length -1);
//         return nums;
//     }
// }

// Question : 347
// class Solution {
//     Map<Integer, Integer> freqMap;
//     public int[] topKFrequent(int[] nums, int k) {
//         freqMap = new HashMap<>();
//         for(int num : nums){
//             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//         }
//         int n = freqMap.size();
//         int[] unique = new int[n];
//         int i = 0;
//         for(int key : freqMap.keySet()){
//             unique[i++] = key;
//         }
//         quickSort(unique, 0, n -1, n-k);
//         return Arrays.copyOfRange(unique, n-k, n);
//     }
//     public void quickSort(int[] nums, int left, int right, int k){
//         if(left >= right) return;
//         int pivotIndex = partition(nums, left, right);
//         if(pivotIndex == k) return;
//         else if(pivotIndex < k){
//             quickSort(nums, pivotIndex + 1, right, k);
//         }else{
//             quickSort(nums, left, pivotIndex - 1, k);
//         }
//     }
//     public int partition(int[] nums, int left, int right){
//         int pivotFreq = freqMap.get(nums[right]);
//         int storeIndex = left;
//         for(int i = left; i<right; i++){
//             if(freqMap.get(nums[i]) < pivotFreq){
//                 swap(nums, i, storeIndex);
//                 storeIndex++;
//             }
//         }
//         swap(nums, storeIndex, right);
//         return storeIndex;
//     }
//     public void swap(int[] nums, int i, int j){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }