package maxSubArray;

/**
 * @author tachai on 2022/2/12 4:23 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        return 1;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max=nums[0];
        int temp=0;

        for(int i=0;i<nums.length;i++){
            temp=Math.max(nums[i],temp+nums[i]);
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
