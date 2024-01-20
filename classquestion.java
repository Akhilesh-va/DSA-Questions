public class classquestion {
    public static void main(String[] args){
        int a[] = {0, -1, 2, -3, 1};
        for(int i=0; i<5; i++){
            for(int j=1; j<5; j++){
                if(a[i]+a[j] == -2){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
