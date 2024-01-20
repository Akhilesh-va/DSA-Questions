public class SingleNumberInArray {
    public static int single(int nums[]){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(single(nums));
    }

}
