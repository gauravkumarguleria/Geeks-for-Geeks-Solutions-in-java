// class Solution {
    
//     public static int compare(long [] arr1, long[] arr2, int l, int r){
//         int n1 = arr1.length;
//         long lval = (l < n1)?arr1[l]: arr2[l - n1];
//         long rval = (r < n1)?arr1[r]: arr2[r - n1];
        
        
//         if(lval < rval) return -1;
//         else if (lval > rval) return +1;
//         else return 0;
        
//     }
//     public static void swap(long[] arr1, long[] arr2, int a , int b){
//         int n1 = arr1.length, n2 = arr2.length;
        
//         if(a<n1 && b<n1){
//             long temp = arr1[a];
//             arr1[a] = arr1[b];
//             arr1[b] = temp;
//         }
//         else if(a < n1 && b>=n1){
//             long temp = arr1[a];
//             arr1[a] = arr2[b - n1];
//             arr2[b - n1] = temp;
//         }
//         else {
//             long temp = arr2[b - n1];
//             arr2[a - n1] = arr2[b - n1];
//             arr2[b - n1] = temp;
//         }
       
//     }
    
//     public static void merge(int n, int m, long arr1[], long arr2[]) {
        
//         //Think in terms of insertion sort
//         for(int i = m; i< m+n; i++){
//           for(int j = i ; j>0 ; j--){
//               if(compare(arr1, arr2,j-1 ,j) > 0){
//                   swap(arr1, arr2, j, j-1);
//               }
//               else break;
//           }
//       }
//     }
// }



