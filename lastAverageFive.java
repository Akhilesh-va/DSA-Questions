public class lastAverageFive {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int sum =0;
        int average=0;
        for (int i =0;i<=a.length-1;i++) {
            if(a[i]%2==0) {
                sum = sum + a[i];
            }


        }
//        average=sum/5;
        System.out.println(sum);
    }
}
