public class BuyAndSellStocksBruteForce {
    public static int maxProfit(int price[]){
        int maxProfit=0;
        for (int i = 0; i < price.length; i++) {
            for (int j = i+1; j < price.length; j++) {
                if(price[i]<price[j]){
                    int currProfit=price[j]-price[i];
                    if(maxProfit<currProfit){
                        maxProfit=currProfit;
                    }
                }

            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        System.out.println(maxProfit(price));
    }
}
