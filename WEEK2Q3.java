import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store the number with its index
            map.put(nums[i], i);
        }
        
        // In case no solution (though problem guarantees one)
        return new int[] {};
    }
}
