package LeetCode;

public class RemoveDupFromSortedList {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[count] != nums[i]) {
                nums[++count]=nums[i];

            }
        }
        return ++count;
    }
    public static void main(String[] args) {
        RemoveDupFromSortedList r = new RemoveDupFromSortedList();
        System.out.println(r.removeDuplicates(new int[]{1,1,2,3,3,4}));
    }
}
