package uniquePaths;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tachai on 2022/8/4 8:01 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * https://leetcode.cn/problems/unique-paths/
 *
 *
 * 自己写的递归  网站上不能通过 本地是可以的  emco
 */
public class Solution {


    public static volatile AtomicInteger l=new AtomicInteger(0);

    public static  int uniquePaths(int m, int n) {

     solation(m,n);


      return l.get();
    }

    public synchronized static void  solation(int m, int n){
        if(m<1||n<1){
             return ;
        }
        if(m==1&&n==1){
            l.getAndIncrement();
        }

        solation(m-1,n);
        solation(m,n-1);
    }
     // 网站上推荐的dp
    public int method2(int m,int n){
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(19,13));



    }
}
