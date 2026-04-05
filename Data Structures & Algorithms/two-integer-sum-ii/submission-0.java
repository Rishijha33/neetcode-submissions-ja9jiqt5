class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int[] ans = new int[2];
        while(low <= high){
            int sum = numbers[low] + numbers[high];
            if(sum == target) break;
            else if(sum > target) high--;
            else low++;
        }

        ans[0] = low+1;
        ans[1] = high+1;
        return ans;
    }
}
