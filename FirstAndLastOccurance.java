public class FirstAndLastOccurance {
    public static int search(int nums[],int target , boolean firstsearchIndex){
        int MaybeAns=-1;
        int s=0;
        int e= nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target>nums[m]){
                s=m+1;
            }
            else if(target<nums[m]){
                e=m-1;
            }
            else{
                MaybeAns = m;
                if(firstsearchIndex){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }
        return MaybeAns;
    }
    public static int[] searchrange(int nums[], int target){
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);

        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,5,5,5,6,7,8};
        int target=5;
        System.out.println( searchrange(nums,target));




    }

}
