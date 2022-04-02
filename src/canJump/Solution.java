package canJump;

/**
 * leetcode  第55题  跳跃游戏
 *  https://leetcode-cn.com/problems/jump-game/
 * @author tachai on 2022/4/2 2:15 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public boolean canJump(int[] nums){
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }





    public static void main(String[] args) {
        //int[] nums = {2,3,1,1,4};
        int[] nums = {3,0,8,2,0,0,1};




        System.out.println();

    }
}
