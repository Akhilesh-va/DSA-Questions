public class PrefixSubArraySum {
    public static void maxSubArraySum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int sum = 0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(arr);
    }
}
