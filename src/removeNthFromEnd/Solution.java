package removeNthFromEnd;

/**
 * Create by tachai on 2021/8/19 3:56 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */

import java.util.ArrayList;
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> listNodes=new ArrayList<>();
        traver(listNodes,head);
        int size=listNodes.size();
        if(size==1){
            return new ListNode();
        }
        if(size==n){
            return listNodes.get(1);
        }

        ListNode root=listNodes.get(size-n-1);
        ListNode curr = listNodes.get(size-n);
        if(n>1){
            root.next=curr.next;

        }else {
            root.next=null;
        }
        return head;
    }


    public static void traver(List<ListNode> listNodes,ListNode node){
        if(node==null){
            return;
        }
        listNodes.add(node);
        traver(listNodes,node.next);
    }


    public static void printTraver(ListNode node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        printTraver(node.next);
    }


    public static void main(String[] args) {
         ListNode head1=new ListNode(1);
         ListNode head2=new ListNode(2);
         ListNode head3=new ListNode(3);
         ListNode head4=new ListNode(4);
         ListNode head5=new ListNode(5);
         head1.next=head2;
         head2.next=head3;
         head3.next=head4;
         head4.next=head5;

        removeNthFromEnd(head1,2);
        printTraver(head1);
    }

}
