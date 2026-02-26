class Solution {
    /**
     * Finds duplicates in O(n) time and O(1) auxiliary space.
     * Strategy: Use the value at index (abs(x)-1) as a seen-flag by negating it.
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Use the absolute value to find the 'target' index
            int targetIndex = Math.abs(nums[i]) - 1;
            
            // If the value at targetIndex is already negative, we've seen this number before
            if (nums[targetIndex] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                // Otherwise, mark it as seen by negating the value
                nums[targetIndex] = -nums[targetIndex];
            }
        }
        
        return result;
    }
}