import java.util.Arrays;

public class cyclic_Sort {
 public static void sort(int arr[],int start , int end){

     while(start<end){
         int correct = arr[start]-1;
//         Question me given rahega ki 0-n hai ya 1-n hai;
         if(arr[start]==arr[correct]){
             start++;
         }
         else{
             swap(arr,start,correct);
         }
     }
 }
 public static void swap(int arr[],int start , int correct){
     int temp = arr[start];
     arr[start]=arr[correct];
     arr[correct]=temp;
 }

    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};
        int start =0;
        int end = arr.length;
        sort(arr,start,end);
        System.out.println(Arrays.toString(arr));

    }

}
