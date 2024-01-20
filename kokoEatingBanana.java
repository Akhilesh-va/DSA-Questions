public class kokoEatingBanana {
    public static void main(String[] args) {
        int piles[]={30,11,23,4,20};
        int h = 6  ;
        System.out.println(koko(piles,h));
    }
    public static int max(int piles[]){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        return max;
    }
    public static int totalh(int piles[],int bph,int max){
        int totalh=0;
        int n = piles.length;
        for(int i=0;i<n;i++ ){
            totalh+=Math.ceil((double)piles[i]/(double)(bph));
        }
        return totalh;

    }
    public static int koko(int piles[],int h){
        int low=0;int high=max(piles);
        while(low<=high){
            int mid=low+((high-low)/2);
            int th = totalh(piles,mid,high);
            if(th<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
