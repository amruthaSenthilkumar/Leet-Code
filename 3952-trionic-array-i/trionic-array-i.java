class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        // Must have at least 4 elements to form 3 non-empty segments
        if (n < 4) return false;

        // 1) Move p to end of strictly increasing segment
        int p = 0;
        while (p < n - 2 && nums[p] < nums[p + 1]) {
            p++;
        }
        // p must be >0 (non-empty first segment)
        if (p == 0) return false;

        // 2) Move q to end of strictly decreasing segment
        int q = p;
        while (q < n - 1 && nums[q] > nums[q + 1]) {
            q++;
        }
        // Second segment must be non-empty and leave room for third
        if (q == p || q == n - 1) return false;

        // 3) Check the final part is strictly increasing till the end
        while (q < n - 1 && nums[q] < nums[q + 1]) {
            q++;
        }

        // If q reaches end, we formed all three correct segments
        return q == n - 1;
    }
}