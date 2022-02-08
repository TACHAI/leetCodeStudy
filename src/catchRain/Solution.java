package catchRain;

/**
 * @author tachai on 2022/2/8 8:34 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {
    public int trap(int[] height) {
        int sum =0;
        for(int i=0;i<height.length;i++){
            int maxleft =0;
            // 左边最大值
            for(int left=0;left<i;left++){
                if(height[left]>maxleft){
                    maxleft=height[left];
                }
            }

            // 右边最大值
            int maxright =0;
            for(int right=i;right<height.length;right++){
                if(height[right]>maxright){
                    maxright=height[right];
                }
            }

            int temp=Math.min(maxleft,maxright);

            if(height[i]<temp){
                sum=sum+(temp-height[i]);
            }

        }
        return sum;
    }
}
