public class subArraySum {

        public static void subArrays(int arr[]){
//            int count =0;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        sum=sum+arr[k];
                    }
//                    count++;
                    System.out.println(sum);
                }

            }

        }

        public static void main(String[] args) {
            int arr[]= {2,4,6,8,10};
            subArrays(arr);
        }

    }


