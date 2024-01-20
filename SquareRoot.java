public class SquareRoot {
    public static int SquareRoot(int N){
        int low = 0;
        int high = N;
        while(low<=high){
            int mid = low +((high - low)/2);
            if(mid*mid==N){
                int ans = mid ;

            }
            if(mid*mid>N){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return high;
    }


    public static void main(String[] args) {
        int target = 37;
        System.out.println(SquareRoot(target));
//        System.out.println(multiple(3,3));
    }


}
