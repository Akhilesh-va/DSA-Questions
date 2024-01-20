public class smallestGreatest {
    public static int smallestGreatest(int arr[] , int target){
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
        int arr[]={1,2,5,6,7,8,9,10};
        int target=3;


        System.out.println(smallestGreatest(arr,target));
    }
}
