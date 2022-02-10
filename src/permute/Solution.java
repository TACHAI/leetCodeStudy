package permute;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * 46. 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * @author tachai on 2022/2/10 3:50 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {
    // 结果数组
    List<List<Integer>> res = new LinkedList<>();


    public List<List<Integer>> permute(int[]nums){
       // 路径
        LinkedList<Integer> road = new LinkedList<>();
        backtrack(road,nums);
        return res;
    }


    public void backtrack(LinkedList<Integer> road,int[] nums){
        if(nums.length==road.size()){
            res.add(new LinkedList<>(road));
            return;
        }
        for(int num:nums){
            // 挨个做选择
            // 这个点已经走过了，不走了
            if(road.contains(num)){
                continue;
            }
            // 没走过这个点，加入到路径当中
            road.add(num);
            // 进入下一层决策树
            backtrack(road,nums);
            // 递归之后，要回头，撤销选择
            road.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,4};

        nums.toString();
        System.out.println(nums);
    }
}
