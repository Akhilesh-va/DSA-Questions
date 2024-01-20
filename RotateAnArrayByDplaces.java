public class RotateAnArrayByDplaces {
    public static int[] roatate(int arr[], int d){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];

        }
        for(int i = arr.length-d;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-d)];

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d =3;
        roatate(arr,d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
