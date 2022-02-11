package permute;

import java.util.*;

/**
 * @author tachai on 2022/2/11 11:21 上午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Demo {

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> road = new ArrayList<>();
        List<String> strs= new LinkedList<>();
        List<Integer> numList= new LinkedList<>();
        for(int num:nums){
            numList.add(num);
        }
        dfs(res,road,strs,numList);
        return res;
    }

    public static void dfs( List<List<Integer>> res, List<Integer> road, List<String> strs,List<Integer> nums){
        String temp="";
        for (int str:road){

            temp=temp+str;
        }
        if(strs.contains(temp)){
            return;
        }else {
            strs.add(temp);
        }

        if(nums.size()==0){
            res.add(new ArrayList<>(road));
            return;
        }

        for(int i=0;i<nums.size();i++){
            road.add(nums.get(i));
            List<Integer> list =new ArrayList<>();
            list.addAll(nums);
            list.remove(i);
            dfs(res,road,strs,list);
            road.remove(road.size()-1);
        }

    }


    public static void main(String[] args) {
        int[] nums={1,1,2};

        List<List<Integer>> res =permute(nums);
        for(int i=0;i<res.size();i++){
            List<Integer> line=res.get(i);
            for(int j=0;j<line.size();j++){
                System.out.print(line.get(j));
            }
            System.out.println();

        }
    }
}
