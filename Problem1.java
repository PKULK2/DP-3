class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int [] dp = new int [max + 1];
        for(int num : nums){
            dp[num] += num;
        }
                    System.out.println(Arrays.toString(dp));

        int previous = dp[0];
        int current = Math.max(previous, dp[1]);
        for(int i = 2; i < dp.length; i++){
            int temp = current;
            current = Math.max(current, dp[i] + previous);
            previous = temp;
        }
        return current;

    }
}
