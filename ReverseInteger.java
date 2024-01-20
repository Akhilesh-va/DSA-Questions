public class ReverseInteger {
    public static int reverse(int n) {
        int temp=n;
        int r=0;
        int sum =0;
        while(n!=0){
            r=n%10;
            sum= sum*10 +r;
            n/=10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int n=-81;
        System.out.println(reverse(n));
    }
}
