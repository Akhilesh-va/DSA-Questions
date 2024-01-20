public class MissingNumber {
    public static int missing (int nums[]){
        int n = nums.length;
        int sum = n*(n+1)/2;
        int arrsum=0;
        for(int i = 0;i<=n-1;i++){
            arrsum+=nums[i];

        }
        return sum-arrsum;
    }

    public static void main(String[] args) {
        int nums[]={0,1};
        System.out.println(missing(nums));
    }

}
