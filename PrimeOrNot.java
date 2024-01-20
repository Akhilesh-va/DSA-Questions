import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean PrimeNum=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                PrimeNum = false;

            }
        }
        if(PrimeNum=true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
