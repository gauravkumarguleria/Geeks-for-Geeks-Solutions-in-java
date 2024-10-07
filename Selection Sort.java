class Solution
{
    int compare(int [] arr, int l, int r){
        if(arr[l] < arr[r]) return -1;
        else if (arr[l] > arr[r]) return +1;
        else return 0;
        
    }
    
	void swap(int arr[], int i, int min)
	{
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        
	}
	
	void selectionSort(int arr[], int n)
	{   
	    for(int i = 0; i<n - 1; i++){
	        int min = i;
	        for(int j = i+1; j< n; j++){
	           if(compare(arr, min, j) > 0)
	                min = j;
	        }
	        swap(arr, i, min);
	        
	    }
	}
}
