public class SmallestDivisorForGivenThresold {
    public static int max(int arr[]){
//        int n = arr.length;
        int max= Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            max=Math.max(arr[i],max);
                    }
        return max;
    }
    public static int sumofdivisons(int arr[] , int div){
        int sum =0;
            for(int i =0;i<arr.length;i++){
                sum += Math.ceil((double)(arr[i])/(double)(div));
            }
        return sum;
    }
    public static int smallestDivisor(int arr[],int thresold){
        if(arr.length>thresold) return -1;
        int ans=-1;
        int low=0;
        int high=max(arr);
        while(low<=high){
            int mid = low+((high-low)/2);
            if(sumofdivisons(arr,mid)<=thresold){
                ans=mid;
                high = mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={44,22,33,11,1, 90, 99, 9000};
        int thresold=500;
        System.out.println(max(arr));
        System.out.println(sumofdivisons(arr,5));
        System.out.println(smallestDivisor(arr,thresold));
    }

}
