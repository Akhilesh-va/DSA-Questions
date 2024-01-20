public class BinToDec {
    public static int BinToDec(int binnum){
        int dec=0;
        int pow=0;
        while(binnum>0){
            int lastdigit = binnum%10;
            dec = dec+lastdigit*(int)Math.pow(2,pow);
            binnum=binnum/10;
            pow++;
        }
        return dec;
    }

    public static void main(String[] args) {
        int binnum=101;
      int answer=  BinToDec(binnum);
        System.out.println("The decimal of "+ binnum +" is "+answer);
    }
}
