public class maxSubarrayKadensAlgo {
    public static void maxSubarrayKadensAlgo(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            maxsum=Math.max(sum,maxsum);
        }
        System.out.print("The max sum is " + maxsum);


    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarrayKadensAlgo(arr);
    }
}
