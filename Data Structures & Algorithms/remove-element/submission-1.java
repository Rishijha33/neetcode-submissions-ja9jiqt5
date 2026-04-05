class Solution {
    public int removeElement(int[] nums, int val) {
        // When the target is encounterd, move it to the back of the lsit
        
        int count = 0;
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            if(nums[low] == val){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                count++;
                high--;
            }
            else{
                low++;
            }
        }

        return nums.length - count;
    }
}