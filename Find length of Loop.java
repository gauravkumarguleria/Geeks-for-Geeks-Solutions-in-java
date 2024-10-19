class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) break;
        }
        
        if(fast == null || fast.next == null) return 0;
        
        int dist = 1;
        
        Node curr  =  slow.next;
        while(curr != slow){
            curr = curr.next;
            dist++;
        }
        
        return dist;
    }
}
