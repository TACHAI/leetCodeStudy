package isValid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Create by tachai on 2021/8/19 6:50 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *
 */
public class Solution {
    public static boolean isValid(String s) {

        String[] target=s.split("");
        Stack stack=new Stack();

        Map<String, String> map=new HashMap<>();
        map.put(")","(");
        map.put("}","{");
        map.put("]","[");

        for(int i=0;i<target.length;i++){
            stack.push(target[i]);

            if(target[i].equals(")")||target[i].equals("}")||target[i].equals("]")){
                stack.pop();
                if(stack.isEmpty()){
                    return false;
                }
               String temp= (String) stack.pop();
               if(temp.equals(map.get(target[i]))){

               }else {
                   stack.push(target[i]);
               }
            }

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("({})"));
    }
}
