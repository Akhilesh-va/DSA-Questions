public class MinimumRotatedSortedArray {
    public static int findmin(int nums[]){
        int start=0;
        int end=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(start<=end){
            int mid=( start+end)/2;
            if(nums[start]<=nums[mid]){
                ans = Math.min(nums[start],ans);
                start=mid+1;
            }
            else{
                ans = Math.min(nums[mid],ans);
                end=mid-1;
            }
        }
            return ans;
    }

    public static void main(String[] args) {
        int nums[]={4,5,1,2,3};
        System.out.println(findmin(nums));
    }
}
