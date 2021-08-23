package mergeTwoLists;

/**
 * Create by tachai on 2021/8/19 7:34 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 21.合并两个有序链表
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 例如：输入 l1=[1,2,4],l2=[1,3,4]
 *      输出 [1,1,2,3,4,4]
 */

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root =new ListNode();
        traver(root,l1,l2);
        return root.next;
    }

    public static void traver(ListNode root,ListNode l1,ListNode l2){
        if(l1==null){
            root.next=l2;
            return;
        }

        if(l2==null){
            root.next=l1;
            return;
        }
        if(l1.val>l2.val){
            root.next=l2;
            traver(root.next,l1,l2.next);
        }else {
            root.next=l1;
            traver(root.next,l1.next,l2);
        }

    }
}
