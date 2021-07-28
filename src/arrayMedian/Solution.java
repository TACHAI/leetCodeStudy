package arrayMedian;

/**
 * Create by tachai on 2021/7/28 7:28 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 4. 寻找两个正序数组的中位数
 *
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] temp=new int[nums1.length+nums2.length];
        int key1=0;
        int key2=0;
        for(int i=0;i<temp.length;i++){
            if(key1==nums1.length){
                temp[i]=nums2[key2];
                key2++;
            }

            if(key1==nums1.length&&key2==nums2.length){
                continue;
            }

            if(key2==nums2.length){

                temp[i]=nums1[key1];
                key1++;
            }


            if(key1<nums1.length&&key2<nums2.length){
                if(nums1[key1]<nums2[key2]){
                    temp[i]=nums1[key1];
                    key1++;
                }else {
                    temp[i]=nums2[key2];
                    key2++;
                }
            }

        }

        double res;
        int y=temp.length%2;
        if(y>0){
           res=temp[(temp.length-y)/2];
        }else {
            res=(temp[(temp.length-y)/2]+temp[(temp.length-y)/2-1])/2.0;
        }
        return res;
    }


    public static void main(String[] args) {
//       int[] nums1=new int[]{1,3},nums2=new int[]{2};
//        System.out.println(findMedianSortedArrays(nums1,nums2));
//

        int[] nums3=new int[]{1,2},nums4=new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums3,nums4));

        int[] nums5=new int[]{0,0},nums6=new int[]{0,0};
        System.out.println(findMedianSortedArrays(nums5,nums6));

        int[] nums7=new int[]{},nums8=new int[]{1};
        System.out.println(findMedianSortedArrays(nums7,nums8));

        int[] nums9=new int[]{2},nums10=new int[]{};
        System.out.println(findMedianSortedArrays(nums9,nums10));

    }
}
