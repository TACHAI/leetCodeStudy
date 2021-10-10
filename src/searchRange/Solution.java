package searchRange;

/**
 * Create by tachai on 2021/10/10 7:15 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */

/**
 * leetCode 第34题
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        boolean value= false;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(!value){
                    res[0]=i;
                    value=true;
                }else {
                   temp++;
                }
            }
        }
        res[1]=res[0]+temp;
        return res;
    }
}
