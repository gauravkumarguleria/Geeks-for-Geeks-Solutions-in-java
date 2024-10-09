class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1 = m-l+1;
         int n2 = r-m;
         int[] l1 = new int[n1];
         int[] r1 =new int[n2];
         
         for(int i=0;i<n1;i++){
            l1[i] = arr[l+i]; 
         }
         for(int j=0;j<n2;j++){
             r1[j] = arr[m+1+j];
         }
         
         
         
         int i=0,j=0,k=l;
         while(i<n1 && j<n2){
             if(l1[i] < r1[j]){
                 arr[k] = l1[i];
                 i++;
             }
             else{
                 arr[k] = r1[j];
                 j++;
             }
             k++;
         }
         while(i<n1){
             arr[k] = l1[i];
             k++;
             i++;
         }
         while(j<n2){
             arr[k] = r1[j];
             k++;
             j++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        
    }
}
