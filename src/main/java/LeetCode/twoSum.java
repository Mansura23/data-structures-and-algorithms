package LeetCode;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); // Store number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required complement

            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i}; // Return indices if complement found
            }

            numMap.put(nums[i], i); // Store the current number and its index
        }

        return new int[] {}; // Redundant as per problem constraints (always one solution exists)
    }

    public static void main(String[] args){
        twoSum solution=new twoSum();
        int[]nums = {2,7,11,15};
        int target = 9;
        System.out.println(solution.twoSum(nums,target));

    }
}
