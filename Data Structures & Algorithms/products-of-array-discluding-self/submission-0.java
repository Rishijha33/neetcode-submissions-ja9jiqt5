class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        pf[0] = nums[0];
        sf[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            pf[i] = nums[i]*pf[i-1];
            sf[n-i-1] = nums[n-i-1] * sf[n-i]; 
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            // get prefix
            int pre = 1;
            if(i>0){
                pre = pf[i-1];
            }
            int suf = 1;
            if(i<n-1){
                suf = sf[i+1];
            }

            ans[i] = pre*suf;
            //get suffix
            //multiply ans store the res
        }

        return ans;
    }
}  
