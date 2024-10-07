// class Solution
// {
//     //Function to sort the array using bubble sort algorithm.
//     public static void swap(int[] arr, int a , int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }
// 	public static void bubbleSort(int arr[], int n)
//     {
//         for(int i = 0; i< arr.length; i++){
//             for(int j = i+1; j< arr.length; j++){
//                 if(arr[i]> arr[j])
//                     swap(arr, i, j);
//             }
//         }
//     }
// }


class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static int compare(int [] arr, int l, int r){
        if(arr[l] < arr[r]) return -1;
        else if (arr[l] > arr[r]) return +1;
        else return 0;
        
    }
    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
	public static void bubbleSort(int nums[], int n)
    {
         for(int i = 0; i< nums.length - 1; i++){
            for(int j = 0; j< nums.length - i - 1; j++){
                if(compare(nums, j, j+1) > 0)
                    swap(nums, j+1, j);
            }
        }
    }
}
