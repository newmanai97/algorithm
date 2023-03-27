package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/27/17:14
 * @Description:
 */
public class No283 {
    public static void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        while (fast < nums.length){
            if (nums[fast] != 0){
                int k = nums[fast];
                nums[fast] = 0;
                nums[slow] = k;
                slow ++;
            }
            fast ++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
