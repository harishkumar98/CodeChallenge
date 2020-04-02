import Java.util.*;
 // Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
 
public class LinkedListTwoNumberSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode a = l1, b = l2, curr = head;
        int carry = 0;
        while(a != null || b != null){
            int x = (a != null)? a.val : 0;
            int y = (b != null)? b.val : 0;
            int sum = carry+x+y;
            
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
    
        return head.next;
    
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        LinkedListTwoNumberSum obj = new LinkedListTwoNumberSum();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l1head = l1;
        ListNode l2head = l2;

        for(int i = 0; i<3 ; i++){
            l1head.next = new ListNode(i+3);
            l2head.next = new ListNode(i+2);
            l1head = l1head.next;
            l2head = l2head.next;
        }

        ListNode res = obj.addTwoNumbers(l1.next, l2.next);
        while(res != null){
            System.out.println(res.val);
            if(res != null) {
                res = res.next;
            }
        }

    }
}