// these 2 codes will run for every left rotate and right rotate questioin ;


// code -----> 1 ----> Using modular function k%n
public class rotateaAnArray {
    public static int[] roatateUsingMod(int arr[],int k){
        int n = arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i]=temp[i];

        }
        return arr;
    }
    //    code 2 --> While reversing the array
    public static int[] reverse(int arr[],int k,int low ,int high){
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
        return arr;
    }
    public static int[] roatateUsingReverse(int arr[],int k){

        //Right rotate
        reverse(arr,k,0,arr.length-1-k);
        reverse(arr,k,arr.length-k,arr.length-1);
        reverse(arr,k,0,arr.length-1);

//        ---> Left rotate



//        reverse(arr,k,0,0+k);
//        reverse(arr,k,k+1,arr.length-1);
//        reverse(arr,k,0,arr.length-1);
        return arr;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        int low=0;
        int high = arr.length-1;
//        roatateUsingMod(arr,k);
//        reverse(arr,2,low,high);
        roatateUsingReverse(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }










}
