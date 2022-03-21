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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode = new ListNode(0);
        ListNode tempNode = dummyNode;
        ListNode n1 = l1;
        ListNode n2 = l2;
        boolean carry = false;
        
        while(n1!=null || n2!=null)
        {
            int sum = 0;
            if(carry)
            {
                sum = (n1==null?0:n1.val)+(n2==null?0:n2.val)+1;
            }else{
                sum = (n1==null?0:n1.val)+(n2==null?0:n2.val);
            }
            
            if(sum>=10)
            {
                carry = true;
            }else{
                carry = false;
            }
            
            int currVal = sum%10;
            tempNode.next = new ListNode(currVal);
            tempNode = tempNode.next;
            if(n1==null)
            {
               n1 = null; 
            }else{
               n1=n1.next; 
            }
             if(n2==null)
            {
               n2 = null; 
            }else{
               n2=n2.next; 
            }
             
        }
        
        if(carry)
        {
            tempNode.next = new ListNode(1);
            
        }
        return dummyNode.next;
        
    }
}