package minPathSum;

/**
 *
 * 64  最小路径和
 * @author tachai on 2023/1/6 10:37 上午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public int minPathSum(int[][] grid){


        int height = grid.length;

        int with=grid[0].length;

        int[][] dp=new int[height][with];
        dp[0][0]=grid[0][0];
        for(int i=1;i<height;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }

        for(int j=1;j<with;j++){
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }


        for(int i=1;i<height;i++){
            for(int j=1;j<with;j++){
                dp[i][j]=Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[height-1][with-1];
    }
}
