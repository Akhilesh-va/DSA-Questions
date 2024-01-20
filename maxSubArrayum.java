public class maxSubArrayum {


        public static void MaxSumsubArrays(int arr[]){
//            int count =0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        sum=sum+arr[k];
                    }
//                    count++;
                    System.out.println(sum);
                    if(max<sum){
                        max=sum;
                    }
                }

            }
            System.out.println("the max sum is  " + max );

        }

        public static void main(String[] args) {
            int arr[]= {-2,-3,4,-1,-2,1,5,-3};
            MaxSumsubArrays(arr);
        }

    }




