package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author tachai on 2022/7/25 9:05 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 *  合并区间
 * https://leetcode.cn/problems/merge-intervals/
 */
public class Solution {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        int i=0;
        List<int[]> merged = new ArrayList<int[]>();
        int n = intervals.length;
        while(i<n){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i<n-1 && right>=intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            merged.add(new int[] {left,right});
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }


    public static void main(String[] args) {
        int[][] test=new int[][]{{1,3},{2,6},{8,10},{15,18}};
       int[][] res = merge(test);

       for(int i=0;i<res.length;i++){

           System.out.println("["+res[i][0]+","+res[i][1]+"]");
       }
    }
}
