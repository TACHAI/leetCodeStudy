package longestValidParentheses;

import java.util.Stack;

/**
 * Create by tachai on 2021/8/25 4:39 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public static int longestValidParentheses(String s) {
        int max=0;
        Stack stack=new Stack();
        String[] strs=s.split("");
        stack.push(-1);
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("(")){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    max =Math.max(max,i-(Integer) stack.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String res="()()()";
        System.out.println(longestValidParentheses(res));
    }
}
