import java.util.ArrayList;

public class MoveZerosAtTheEndofArray {
    public static int[] move(int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int n=temp.size();
        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }
        for (int i = n; i < arr.length ; i++) {
            arr[i]=0;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
