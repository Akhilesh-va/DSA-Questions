public class pattern_printing {
    public static void pattern1(int m ){
        for (int i = m; i >0; i--) {
            for (int k = m-i ;k >0; k--) {
                System.out.print(" ");

            }
            for (int j =  i*2 -1; j >0; j--) {
                System.out.print("*" );
          }

            System.out.println();

        }

    }
    public static void pattern2(int m ){
        for (int i = 0; i <m; i++) {
            for (int k = 0 ;k <m-i; k++) {
                System.out.print(" ");

            }
            for (int j =  0; j <=i; j++) {
                System.out.print("* " );
            }

            System.out.println();

        }

    }
    public static void pattern3(int m ){
        for (int i = 0; i <2*m; i++) {
            if(i<m){
                for (int k = 0 ;k <i; k++) {
                    System.out.print(" ");

                }
                for (int j =  0; j <m-i; j++) {
                    System.out.print("* " );
                }
            }
            else{
                for (int k = 0 ;k <(2*m-1-i); k++) {
                    System.out.print(" ");


                }
                for (int j =  0; j <i-m+1; j++) {
                    System.out.print("* " );
                }

            }

            System.out.println();

        }

    }
    public static void pattern8(int m ){
        for (int i = 0; i < m; i++) {
            for (int k = 0; k <m-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                            }


            System.out.println();
        }

    }

    public static void main(String[] args) {
//        pattern1(5
//        );
//        pattern2(5);
//        pattern3(5);
        pattern8(5);

    }


}
