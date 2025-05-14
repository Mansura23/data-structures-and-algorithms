package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
       char[] sChar = s.toCharArray();
       char[] tChar = t.toCharArray();
       Arrays.sort(sChar);
       Arrays.sort(tChar);
       return Arrays.equals(sChar, tChar);
    }
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
    }
}
