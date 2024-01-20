public class DecToBin {
    public static int DecToBin(int decnum){
        int bin=0;
        int pow=0;
        while(decnum>0){
            int rem = decnum%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            decnum=decnum/2;

        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(5));
    }
}
