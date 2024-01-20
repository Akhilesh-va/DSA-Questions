public class Searchin2DMatrix_11 {
    public static boolean search(int matrix [][],int target){
        int ans[]={-1,-1};
        int r=0;
        int c = matrix[0].length-1;
        while(r<matrix.length && c>=0 ){
            if(matrix[r][c]==target){
                ans[0]=r;
                ans[1]=c;
                return true;
            }
            else if(matrix[r][c]<target){
                r++;

            }
            else{
                c--;
            }

        }
        return false ;
    }

    public static void main(String[] args) {
        int matrix[][]={ {1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 11;
        System.out.println( search(matrix,11));;
    }
}
