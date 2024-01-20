public class noOfBoquets {
//    public static int min(int bloomDay[]){
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i<bloomDay.length;i++){
//            min= Math.min(bloomDay[i],min);
//        }
//        return min;
//    }
//    public static int max(int bloomDay[]) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < bloomDay.length; i++) {
//            max = Math.max(bloomDay[i], max);
//        }
//        return max;
//    }
    public static boolean posssible(int bloomDay[],int days,int m ,int k ){
        int count=0;
        int Bouquets=0;
        int n = bloomDay.length;
        for(int i = 0;i<n;i++){
            if(bloomDay[i]<=days){
                count++;
            }
            else{
                Bouquets+=(count/k);
                count =0;
            }

        }
        Bouquets+=(count/k);
        if(Bouquets>=m){
            return true;
        }
        else return false;
    }
    public static int miindays(int bloomDay [],int m,int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(bloomDay[i], max);
            min = Math.min(bloomDay[i], min);
        }
        int low = min;
        int high = max;
        while(low<=high){
            int mid= (low+high)/2;
            if(posssible(bloomDay,mid, m,k) == true){
                int ans = mid;
                high= mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int bloomDay[]={7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println(
                miindays(bloomDay,m,k));
    }
}
