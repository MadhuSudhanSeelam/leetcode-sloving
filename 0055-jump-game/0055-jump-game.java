class Solution {
    public boolean canJump(int[] nums) {
        
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // cannot reach this position
            if (i > maxReach)
                return false;

            // update farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}