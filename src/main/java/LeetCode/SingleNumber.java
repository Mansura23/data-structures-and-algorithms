package LeetCode;

public class SingleNumber {
    public int FindingSingleNumber(int[] nums) {
        int xor=nums[0];
        for (int i = 1; i < nums.length; i++) {
           xor=xor^nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,2,1,2,1};
        System.out.println(singleNumber.FindingSingleNumber(nums));
    }
}
