package generateParenthesis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Create by tachai on 2021/8/23 7:04 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 括号生成
 * 数字n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能并且有效的括号组合
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
 *
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 *
 * 1<=n<=8
 *
 */
public class Soultion {
    public static List<String> generateParenthesis(int n) {

        Set<String> set= new HashSet<>();
        set.add("()");
        generate(set,n-1);
        return set.stream().collect(Collectors.toList());
    }


    public static void generate(Set<String> set, int n){
        if(n==0){
            return ;
        }
        List<String> list = set.stream().collect(Collectors.toList());
        for(int i=0;i<list.size();i++){

            int len =list.get(i).length();
            for(int j=0;j<len;j++){
                String left=list.get(i).substring(0,j);
                String right=list.get(i).substring(j,len);
                String res=left+"()"+right;
                set.add(res);
            }
            set.remove(list.get(i));
        }
        generate(set,n-1);
    }

    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("()");
        generate(set,2);
        set.forEach(e->{
            System.out.println(e);
        });
    }
}
