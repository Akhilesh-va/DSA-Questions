public class FirstMIssingPosiitve {
    public static int fristMissing(int nums[]){
        cyclicsort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }

        }
        return nums.length+1;
    }
    public static void cyclicsort(int nums[]){
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;

            if(nums[i]>=0 && nums[i]<=nums.length &&nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            } else i++;

        }
    }
    public static void swap(int arr[],int start , int correct){
        int temp = arr[start];
        arr[start]=arr[correct];
        arr[correct]=temp;
    }

    public static void main(String[] args) {
        int nums[]={7,8,9,11,12};
        int a =fristMissing(nums);
        System.out.println(a);
    }
}
