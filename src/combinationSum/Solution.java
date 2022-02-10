package combinationSum;

import java.util.ArrayList;
import java.util.List;

/**
 * 第39题组合总和
 * Create by tachai on 2021/10/25 8:07 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer>option=new ArrayList<>();
        dfs(candidates,res,option,target,0);
       return  res;
    }

    public static void dfs(int[]candidates,List<List<Integer>> res,List<Integer>option,int target,int index){
        if(target==0){
            res.add(new ArrayList<>(option));
            return;
        }

        if(target<0){
            return;
        }
        if(index==candidates.length){
            return;
        }

        dfs(candidates,res,option,target,index+1);
            if(target>=candidates[index]){
                option.add(candidates[index]);
                dfs(candidates,res,option,target-candidates[index],index);
                option.remove(option.size()-1);
            }

    }

    public static void main(String[] args) {
      // 回溯题目   39，40，46，47，78，90

      int[] can=new int[]{2,3,6,7};
      List<List<Integer>> res =combinationSum(can,7);
      res.forEach(e->{
          e.forEach(a->{
              System.out.print(a);
          });
          System.out.println();
      });
    }
}
