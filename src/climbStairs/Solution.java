package climbStairs;

/**
 * 70 爬楼梯
 * @author tachai on 2023/1/6 9:37 上午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {

    public static int climbStairs(int n){

        int[]dp =new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

}
