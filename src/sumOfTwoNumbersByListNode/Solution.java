package sumOfTwoNumbersByListNode;


/**
 * Create by tachai on 2021/7/26 8:20 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 *
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Solution {


    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode res= new ListNode(0);
        if(l1.val+l2.val>=10){
            checkNode(l1);
            res.val=l1.val+l2.val-10;

        }else {
            res.val=l1.val+l2.val;
        }
        if(l1.next==null&&l2.next==null) {
            return res;
        }
        if(l1.next==null){
            l1.next=new ListNode(0);
        }
        if(l2.next==null){
            l2.next=new ListNode(0);
        }
        add(l1.next,l2.next,res);
        return  res;
    }

    public static void  add(ListNode l1,ListNode l2,ListNode sum){
        ListNode res= new ListNode();
        if(l1.val+l2.val>=10){
            res.val=l1.val+l2.val-10;
            // todo
            checkNode(l1);
        }else {
            res.val=l1.val+l2.val;
        }
        sum.next=res;
         if(l1.next==null&&l2.next==null) {
            return;
         }
        if(l1.next==null){
            l1.next=new ListNode(0);
        }
        if(l2.next==null){
            l2.next=new ListNode(0);
        }
         add(l1.next,l2.next,res);
    }

    public static void checkNode(ListNode listNode){
        if(listNode.next==null){
            ListNode next = new ListNode(1);
            listNode.next=next;
            return;
        }else {
            if(listNode.next.val+1>=10){
                listNode.next.val=0;
                checkNode(listNode.next);
            }else {
                listNode.next.val=listNode.next.val+1;
            }
        }
    }


    public static void main(String[] args) {
        ListNode root0= new ListNode(9);
        ListNode root1= new ListNode(9);
        ListNode root2= new ListNode(9);
        ListNode root3= new ListNode(9);
        ListNode root4= new ListNode(9);
        ListNode root5= new ListNode(9);
        ListNode root6= new ListNode(9);
        root0.next=root1;
        root1.next=root2;
        root2.next=root3;
        root3.next=root4;
        root4.next=root5;
        root5.next=root6;


        ListNode foot1= new ListNode(9);
        ListNode foot2= new ListNode(9);
        ListNode foot3= new ListNode(9);
        ListNode foot4= new ListNode(9);
        foot1.next=foot2;
        foot2.next=foot3;
        foot3.next=foot4;

        ListNode res =addTwoNumbers(root0,foot1);
        print(res);
    }

    public static void  print(ListNode listNode){
        if(listNode!=null){
            System.out.print(listNode.val);
        }else {
            return;
        }
        print(listNode.next);
    }

}
