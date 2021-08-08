package maxArea;

/**
 * Create by tachai on 2021/8/8 8:57 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 *
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 *
 * 输入：height = [1,2,1]
 * 输出：2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {


    /**
     *  o(n^2) 策略 暴力破解超时
     * @param height
     * @return
     */
    public static int maxArea(int[] height){
        int maxArea = 0;
        int temp=0;

        for(int i=0;i<height.length-1;i++){
            for(int j=1;j<height.length;j++){

                if(height[i]>height[j]){
                    temp=height[j]*(j-i);
                }else {
                    temp=height[i]*(j-i);
                }

                if(temp>maxArea){
                    maxArea=temp;
                }
            }
        }
        return maxArea;
    }

    /**
     * 0(n) 双指针
     * @param height
     * @return
     */
    public static int max(int[] height){
        int i=0;
        int j=height.length-1;

        int maxArea = 0;
        int temp=0;
        while (i<j){
            if(height[i]<height[j]){
                i++;
            }else {
                j--;
            }
            temp=height[i]*(j-i);
            if(temp>maxArea){
                maxArea=temp;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] height= new int[]{2,11};
        System.out.println(maxArea(height));
    }
}
