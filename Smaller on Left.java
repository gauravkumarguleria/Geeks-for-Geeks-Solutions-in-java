
class Complete {

    // Function for finding maximum and value pair
    public static int[] Smallestonleft(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(s.size() == 0){
                ans.add(-1);
            }
            else if(s.size() > 0 && s.peek()<arr[i]){
                ans.add(s.peek());
            }
            else if(s.size()>0 && s.peek()>=arr[i]){
                while(s.size()>0 && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.size() == 0){
                    ans.add(-1);
                }
                else{
                    ans.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        int []res = new int[arr.length];
        for(int i = 0 ; i<ans.size(); i++){
            res[i] = ans.get(i);
        }
        
        return res;
    }
}
