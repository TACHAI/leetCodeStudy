package search;

/**
 * Create by tachai on 2021/10/10 6:43 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */

/**
 * LeetCode 第33题
 * 搜索旋转排序数组
 * 整数数组nums按升序排列，数组中的值互不相同
 *
 *
 */
public class Solution {
    public int search(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
