package groupAnagrams;

import java.util.*;
import java.util.concurrent.ExecutorService;

/**
 * @author tachai on 2022/2/12 9:43 上午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public List<List<String>> groupAnagrams(String[] strs) {
        return null;
    }

    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> target= new HashMap<>();

        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = target.getOrDefault(key,new ArrayList<>());
            list.add(str);
            target.put(key, list);
        }

        res = new ArrayList<>(target.values());

    }
}
