package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/27/16:35
 * @Description:
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
