class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num : nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(set.contains(num-1)) continue;
            int len = 1;
            while(set.contains(num+1)){
                len++;
                num++;
            }

            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}
