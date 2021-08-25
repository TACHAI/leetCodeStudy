package nextPermutation;

import java.util.Arrays;

/**
 * Create by tachai on 2021/8/24 6:55 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 下一个排列
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列
 * 成字典序中下一个更大的排列。
 *
 * nums=[1,3,4,3,2，1]
 * 输出 [1,4,1,2,3,3]
 */
public class Solution {

    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, len);
                for (int j = i; j <len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;

    }


    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
