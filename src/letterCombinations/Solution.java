package letterCombinations;

import java.util.*;

/**
 * Create by tachai on 2021/8/19 1:47 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 *  电话号码的字母组合
 *  给定一个仅有包含数字2-9的字符串，返回所有它能表示的字母组合。
 *  答案可以按任意顺序返回。
 *  2:abc
 *  3:def
 *  4:ghi
 *  5:jkl
 *  6:mno
 *  7:pqrs
 *  8:tuv
 *  9:wxyz
 *
 */
public class Solution {


    public static List<String> letterCombinations(String digits) {
        int length= digits.length();
        List<String> listStr= new ArrayList<>();
        Map<String, String> baseMap= strMap();
        if(length==0){
            return listStr;
        }
        listStr=Arrays.asList(baseMap.get(digits.substring(0,1)).split(""));
        if(length==1){
           return listStr;
        }
        return letters(listStr,digits.substring(1,length));
    }




    public static List<String> letters(List<String> listStr,String digits){
        String temp=digits.substring(0,1);
        String[] target=strMap().get(temp).split("");
        List<String> res = new ArrayList<>();
        for(int i=0;i<listStr.size();i++){
           for(int j=0;j<target.length;j++){
               String  preStr= listStr.get(i)+target[j];
               res.add(preStr);
           }
        }
        if(digits.length()==1){
            return res;
        }
        return letters(res,digits.substring(1,digits.length()));
    }



    public static Map<String,String> strMap(){
        Map<String, String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        return map;
    }


    public static void main(String[] args) {
        String ss ="23";
       List<String> res= letterCombinations(ss);
       res.forEach(e->{
           System.out.println(e);
       });
    }
}
