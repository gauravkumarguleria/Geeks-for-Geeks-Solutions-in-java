
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new ArrayDeque();
        q.add(0);
        
        boolean [] vis = new boolean[V];
        
        while(q.size()>0){
            int src = q.remove();
            if(vis[src] == true) continue;
            
            vis[src] = true;
            ans.add(src);
            
            for(Integer nbr: adj.get(src))
                q.add(nbr);
        }
        return ans;
    }
}
