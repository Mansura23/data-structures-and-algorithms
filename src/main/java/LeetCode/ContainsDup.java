package LeetCode;

import java.util.HashMap;

public class ContainsDup {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDup solution = new ContainsDup();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};
        System.out.println(solution.containsDuplicate(nums));
    }
}
