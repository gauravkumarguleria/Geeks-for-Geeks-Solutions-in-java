
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    // int getKthFromLast(Node head, int k) {
    //     int size = 0;
    //     Node curr = head;
        
    //     while(curr != null){
    //         curr = curr.next;
    //         size++;
    //     }
        
    //     if(k<=0 || k>size){
    //         return -1;
    //     }
        
    //     curr = head;
    //     for(int idx = 0; idx< size-k; idx++){
    //         curr= curr.next;
    //     }
        
        // return curr.data;

    int getKthFromLast(Node head, int k) {
        Node fast, slow;
        fast = slow = head;
        
        for(int idx = 0; idx<k; idx++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }
    }
}
