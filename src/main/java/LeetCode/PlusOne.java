package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public int[] plusingOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        int[] digits ={1,2,3};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusingOne(digits)));
    }
}
