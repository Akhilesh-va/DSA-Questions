public class Print_N_to_1_Recurssion {
    public static void print(int n ){
        if(n==-197){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        print(9);
    }
}
