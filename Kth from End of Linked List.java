
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        int size = 0;
        Node curr = head;
        
        while(curr != null){
            curr = curr.next;
            size++;
        }
        
        if(k<=0 || k>size){
            return -1;
        }
        
        curr = head;
        for(int idx = 0; idx< size-k; idx++){
            curr= curr.next;
        }
        
        return curr.data;
    }
}
