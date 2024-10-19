class Solution {
    boolean isCircular(Node head) {
        Node slow = head, fast = head;
        
        if(head == null) return true;
        
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) return true;
        }
        
        return false;
    }
}
