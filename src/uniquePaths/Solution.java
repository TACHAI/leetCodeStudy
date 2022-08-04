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
 * 自己写的递归  网站上不人  emco
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

    public static void main(String[] args) {
        System.out.println(uniquePaths(19,13));
    }
}
