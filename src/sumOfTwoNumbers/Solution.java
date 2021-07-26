package sumOfTwoNumbers;

/**
 * Create by tachai on 2021/7/26 7:45 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public static int[] twoSum(int[] nums,int target){
        int[] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test =new int[4];

    }
}
