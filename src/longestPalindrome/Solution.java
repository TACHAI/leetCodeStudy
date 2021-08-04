package longestPalindrome;

/**
 * Create by tachai on 2021/8/4 4:44 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 最长回文子串
 * 给你一个字符串s,找到s中最长的回文子串
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 *
 */
public class Solution {

    public String longestPalindrome(String s) {

        return null;
    }


    public static String longStr(String s){
        char[] chars = s.toCharArray();


        if(s.length()==1){
            return s;
        }

        if(s.length()==2){
            if(chars[0]==chars[1]){
                return s;
            }
            return chars[0]+"";
        }
        int max =0;
        int index=0;

        int len =chars.length;

        for(int i=0;i<len;i++){


            for(int j=i;j>=0;j--){

                if((2*i-j+1)<=(len-1)){
                    if(chars[j]==chars[2*i-j+1]){
                        if((2*i-2*j+1)>max){
                            index=j;
                            max=2*i-2*j+1;
                        }
                    }else {
                        break;
                    }
                }
            }

           for(int j=i;j>=0;j--){
               if((2*i-j)<=(len-1)){
                   if(chars[j]==chars[2*i-j]){
                       if((i-j)*2>max){
                           index=j;
                           max=(i-j)*2;
                       }
                   }else {
                       break;
                   }
               }
           }


        }
        System.out.println("index："+index);
        System.out.println("max："+max);
        return s.substring(index,index+max+1);

    }


    public static void main(String[] args) {
//        System.out.println(longStr("babad"));
//        System.out.println(longStr("cbbd"));
//        System.out.println(longStr("ac"));
        System.out.println(longStr("cccc"));
    }
}
