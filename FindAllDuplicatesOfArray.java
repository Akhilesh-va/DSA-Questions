import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesOfArray {
    public static List<Integer> findduplicates(int nums[]){
        cyclicsort(nums);
        List<Integer> ans = new ArrayList<>();
        for( int i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);

            }
        }
        return ans;

    }
    public static void cyclicsort(int nums[]){
        int i=0;
        while(i<nums.length){
            int correctPosition = nums[i]-1;
            if(nums[i]!=nums[correctPosition]){
                swap(nums,i,correctPosition);
            }else i++;
        }
    }
    public static void swap(int nums[],int i , int correctPosition){
        int temp = nums[i];
        nums[i]=nums[correctPosition];
        nums[correctPosition]=temp;
    }

    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(findduplicates(nums)+" "+",");

        }

    }
}
