public class linearSearch {
    public static void linearsearch(int arr[] , int k){
        int i;
        for( i=0; i<=arr.length-1;i++){
            if(k==arr[i]){
                System.out.println("found at the index " + i);
                break;
            }


        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,78};
        linearsearch(arr,6);
    }

}
