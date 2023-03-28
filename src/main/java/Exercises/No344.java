package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/28/10:58
 * @Description:
 */
public class No344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char k = s[right];
            s[right] = s[left];
            s[left] = k;

            left ++;
            right --;
        }
    }

    public static void main(String[] args) {
        //char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
}
