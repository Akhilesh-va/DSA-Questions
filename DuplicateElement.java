public class DuplicateElement {
    public static int findDuplicate(int[] nums) {
        cyclicsort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];

            }

        }
        return -1;
    }
    public static void cyclicsort(int nums[]){
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }
            else i++;
        }
    }
    public static void swap(int nums[] , int i , int correctindex){
        int temp= nums[i];
        nums[i]=nums[correctindex];
        nums[correctindex]=temp;
    }

    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
