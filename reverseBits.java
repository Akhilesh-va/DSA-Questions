public class reverseBits {
    // you need treat n as an unsigned value
    public static  int reverseBits(int n) {
        int ans=0;
        int i=0;
        while(n!=0){
            int digit = n%10;
            ans += digit * Math.pow((double)2,(double)(i));

            n=n/10;
            i++;
        }

        return ans;

    }
    public static int reverse(int num){
        int numsreversed=0;
        while(num!=0){
            int digit=num%10;
            numsreversed = (numsreversed*10)+digit;
            num=num/10;

        }
        return numsreversed;
    }

    public static void main(String[] args) {
        int n = 1101010;
        int decimal = reverseBits(n);
        System.out.println(decimal);
        System.out.println(reverse(decimal));


    }

}