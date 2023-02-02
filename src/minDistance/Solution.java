package minDistance;

/**
 * 72 编辑距离
 * @author tachai on 2023/1/31 1:56 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public static int minDistance(String word1,String word2){
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];

        // 第一行
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        // 第一列
        for(int i=1;i<=n;i++){
            dp[i][0]=i;
        }
        //
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j])+1;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

        String word1="horse";
        String word2="ros";

        System.out.println(minDistance(word1,word2));

    }
}
