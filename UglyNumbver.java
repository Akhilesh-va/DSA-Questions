public class UglyNumbver {
    public static boolean  number(int n ){
//        15 15 /3 5 /5 1
        int temp=n;
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        if(n==1){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(number(n));
    }
}
