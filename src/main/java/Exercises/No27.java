package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/27/16:35
 * @Description:
 */

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class No27 {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        while (j < nums.length){
            if (nums[j] != val){
                int k = nums[j];
                nums[j] = nums[i];
                nums[i] = k;
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums =  {0,1,2,2,3,0,4,2};
        int result = removeElement(nums, 2);
        System.out.println("result:" + result);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
