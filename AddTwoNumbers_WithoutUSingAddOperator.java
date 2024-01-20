public class AddTwoNumbers_WithoutUSingAddOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(isKthBitSet(3,2));
    }
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.

        int bit =n&(1<<k);
        if(bit==1){
            return false;

        }
        else return true;

    }
}
