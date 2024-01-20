public class MergeTwoSortedArray {
     public static int[] merge(int nums1[], int nums2[], int arr3[], int i , int j, int k , int n, int m , int p ){

         while(i<n && j<m) {
             if (nums1[i] < nums2[j]) {
                 arr3[k] = nums1[i];
                 k++;
                 i++;
             } else {
                 arr3[k] = nums2[j];
                 k++;
                 j++;
             }
         }
             while(i<n){
                 arr3[k]= nums1[i];
                 i++;
                 k++;
             }
             while(j<m){
                 arr3[k]=nums2[j];
                 j++;
                 k++;

         }
     return arr3;

     }

    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int n = arr1.length;
        int arr2[]={2,4,6};
        int m=arr2.length;
        int p=n+m;
        int arr3[]=new int[p];
        int i=0;
        int j=0;
        int k=0;
        merge(arr1,arr2,arr3,i,j,k,n,m,p);
        for(int t=0;t<p;t++){
            System.out.print(arr3[t]+" ");

        }
    }
}


















































































































































































