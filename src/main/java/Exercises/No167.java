package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/28/10:31
 * @Description:
 */
public class No167 {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1){
            return new int[]{};
        }

        int slow = 0;
        int fast = slow + 1;
        while (slow < numbers.length - 1){
            while (fast < numbers.length){
                if (numbers[slow] + numbers[fast] == target){
                    return new int[]{slow+1, fast+1};
                }
                fast++;
            }
            slow++;
            fast = slow+1;
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1){
            return new int[]{};
        }

        int slow = 0;
        int fast = numbers.length - 1;
        while (slow < fast){
            if (numbers[slow] + numbers[fast] == target){
                return new int[]{slow+1, fast+1};
            }else if (numbers[slow] + numbers[fast] > target){
                fast --;
            }else {
                slow ++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] ints = twoSum2(numbers, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
