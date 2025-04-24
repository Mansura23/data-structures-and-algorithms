package LeetCode;

public class LongestCommonPrefix {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int copy=x;
        while(copy>0) {
            rev = rev * 10 + copy % 10;
            copy/= 10;
        }
        if(rev == x) return true;
        return false;
    }
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.println(solution.isPalindrome(121));

    }
}
