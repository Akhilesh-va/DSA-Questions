public class find_ith_bit {
    public static int ith_bit(int n , int k ){
        int mask = (1<<k);
        System.out.println(mask);
        int ans = n & mask;


    return ans;
    }

    public static void main(String[] args) {
        System.out.println(ith_bit(6,2));

    }
}
