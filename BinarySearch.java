
 class BinarySearch{
    public static int  binarysearch(int arr[] , int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target>arr[m]){
                s=m+1;
            }
            else if(target<arr[m]){
                e=m-1;

            }
            else{
                return m;


            }

        }
        return -1;

    }

     public static void main(String[] args) {
         int arr[]={1,3,5,7,9,11,13,15,17};
         int target = 8;
         int ans = binarysearch(arr,target);
         System.out.println(ans);
     }
 }