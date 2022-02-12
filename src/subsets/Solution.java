package subsets;


import java.util.ArrayList;
import java.util.List;

/**
 * @author tachai on 2022/2/12 1:39 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> road= new ArrayList<>();


        dfs(res,nums,road,0);
        return res;
    }


    public static void dfs(List<List<Integer>> res,int[] targets,List<Integer> road,int j){
       res.add(new ArrayList<>(road));
       for(int i=j;i<targets.length;i++){
           road.add(targets[i]);
           dfs(res,targets,road,i+1);
           road.remove(road.size()-1);
       }
    }


    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> list = subsets(nums);
        for(int i=0;i<list.size();i++){

            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
