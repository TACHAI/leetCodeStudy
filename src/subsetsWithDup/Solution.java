package subsetsWithDup;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @author tachai on 2022/2/12 3:36 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> road = new ArrayList<>();
        backtrack(nums,res,road,0,new HashSet<>());
        return res;
    }


    public  void backtrack(int[] nums, List<List<Integer>> res, List<Integer>road, int j, Set<String> sets){

        List<Integer> dob=new ArrayList<>(road);
        dob.sort(Integer::compareTo);

        String temp ="";
        for(Integer str:dob){
           temp=temp+str;
        }
        if(sets.contains(temp)){

        }else {
            sets.add(temp);
            res.add(new ArrayList<>(road));

        }


        for(int i=j;i<nums.length;i++){
            road.add(nums[i]);
            backtrack(nums,res,road,i+1,sets);
            road.remove(road.size()-1);
        }
    }

    public static void main(String[] args) {
//        int[] num={1,2,2};
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> road = new ArrayList<>();
//        Set<String> sets = new HashSet<>();
//        backtrack(num,res,road,0,sets);
//        for(int i=0;i<res.size();i++){
//
//            for(int j=0;j<res.get(i).size();j++){
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println();
//        }
    }
}
