public class FindingElementInRotatedArray {
    public static int find(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (end+start)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target <= nums[mid]){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] ={7,8,9,1,2,3,4,5,6};
        int target = 1;
        int ans = find(nums,target);
        System.out.println(ans);
    }
}
