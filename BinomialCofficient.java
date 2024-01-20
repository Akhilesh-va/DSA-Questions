public class BinomialCofficient {
    public static int fact(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    public static int bioCof(int n , int r){
        int nf = fact(n);
        int rf = fact(r);
        int nmrf = fact(n-r);
        int bc=nf/(rf*nmrf);
        return bc;
    }

    public static void main(String[] args) {
        int binomialCofficient = bioCof(5,2);
        System.out.println(binomialCofficient);
    }
    }