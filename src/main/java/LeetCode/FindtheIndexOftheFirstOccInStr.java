package LeetCode;

public class FindtheIndexOftheFirstOccInStr {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args) {
        FindtheIndexOftheFirstOccInStr solution = new FindtheIndexOftheFirstOccInStr();
        System.out.println(solution.strStr("hello", "hel"));
    }
}
