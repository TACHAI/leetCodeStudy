package isMatch;

/**
 * Create by tachai on 2021/8/5 7:27 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 *
 * 给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖整个字符串s的，而不是部分字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        return false;
    }



    public static boolean match(String s,String p){
        char[] temp1=s.toCharArray();
        char[] temp2=p.toCharArray();


        int start=1;

        for(int i=0;i<temp1.length;i++,start++){

            if(temp2[i]=='.'){
                continue;
            }

//            if(temp2[i]=='*'&&temp2[i-1]=='.'){
//                continue;
//            }


            for (int j=start;j<temp2.length;j++){
                if(temp1[j]==temp2[i]){
                    break;
                }else if(temp2[i]=='*') {
                    if(temp1[j]==temp2[i-1]){
                        start++;
                        continue;
                    }else if(temp1[j]==temp2[i+1]){
                        break;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(match("aa","a"));
    }
}
