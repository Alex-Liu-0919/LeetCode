// solution 1

class Solution {
    public ListNode reverseList(ListNode head) {
       
        return reverse(head, null);
        
    }
    
    private ListNode reverse(ListNode head,ListNode newHead)
    {
        if(head==null)
        {
            return newHead;
        }
        
        ListNode next = head.next;
        head.next = newHead;
         newHead = head;
        head = next;
      
        return reverse(head,newHead);
    }
}