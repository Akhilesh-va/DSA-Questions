public class ElementInInfiniteArray {
    public static int  binarysearch(int arr[] , int target , int start,int end){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target>arr[m]){
                s=m+1;}
            else if(target<arr[m]){
                e=m-1;}
            else{
                return m;}

        }
        return -1;

    }
    public static int find(int arr[],int target){
        int s=0;
        int e=1;
        while(target>=e){
            int temp = e+1;
            /*yaha start ki value is ni update
             kr rhe ki agr yehi update kr diye to niche
             wali calculation galat
             ho jayegi kyuki waha hame previous start
             ki value chahiye na ki new start ki*/
            e=e+(e-s+1)*2;
            s=temp;
        }
        return binarysearch(arr,target,s,e);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(find(arr, target));

    }
}
