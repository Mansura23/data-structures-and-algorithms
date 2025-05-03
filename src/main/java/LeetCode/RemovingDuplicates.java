package LeetCode;

public class RemovingDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count]=nums[i];

            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4};
        RemovingDuplicates r = new RemovingDuplicates();
        System.out.println(r.removeDuplicates(nums));
    }
}
