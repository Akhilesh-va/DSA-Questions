public class ceiling_of_sorted_array {
    public static int  binarysearch(int arr[] , int target){
//ceiling bole to TARGET SE JO BHi bade number honge unmse sabse chots number
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
        return s;

    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,13,15,17};
        int target = 8;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
}
