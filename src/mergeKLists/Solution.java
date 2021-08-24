package mergeKLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Create by tachai on 2021/8/23 8:13 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表
 *
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 *
 */
public class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode root= new ListNode();
        List<Integer> integers=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            traver(integers,lists[i]);
        }
        if(integers.size()==0){
            return null;
        }
        integers.sort(Comparator.comparing(Integer::intValue));

        generate(root,integers,0);
        return root.next;
    }

    public static void traver(List<Integer> integers, ListNode node) {
        if(node==null){
            return;
        }
        integers.add(node.val);
        traver(integers,node.next);
    }

    public static void generate(ListNode root,List<Integer> integers,int n){
        if(n==integers.size()){
            return;
        }
        ListNode node =new ListNode(integers.get(n));
        root.next=node;
        n++;
        generate(node,integers,n);
    }


    public static void main(String[] args) {
        ListNode root= new ListNode();
        root.val=1;
        root.next=new ListNode(4);
        root.next.next=new ListNode(5);


        ListNode root2=new ListNode(1);
        root2.next=new ListNode(3);
        root2.next.next=new ListNode(4);

        ListNode root3=new ListNode(2);
        root3.next=new ListNode(6);

        ListNode[] listNodes=new ListNode[]{root,root2,root3};
        ListNode foot = mergeKLists(listNodes);

    }
}
