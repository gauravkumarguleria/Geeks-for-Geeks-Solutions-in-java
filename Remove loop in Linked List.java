
class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break;
        }
        
        if(fast == null || fast.next == null) return;
        
          if (slow != fast) {
            return;
        }
        
        
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
       
        Node loopNode = slow;
        while (fast.next != loopNode) {
            fast = fast.next;
        }
        fast.next = null; // Break the loop
    }
}
