package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/28/11:06
 * @Description:
 */

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 */
public class No5 {
    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++){
            String palindrome1 = palindrome(s, i, i);
            String palindrome2 = palindrome(s, i, i+1);
            String result = palindrome1.length() > palindrome2.length() ? palindrome1 : palindrome2;
            res = result.length() > res.length() ? result : res;
        }
        return res;
    }

    public static String palindrome (String target, int l, int r){
        while (l >= 0 && r <= target.length() - 1 && target.charAt(r) == target.charAt(l)){
            l--;
            r++;
        }
        return target.substring(l + 1, r);
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
