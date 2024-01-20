public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
       int row =0;
       int col=matrix[0].length-1;
       while(row<matrix.length-1 && col>=0){
           if(matrix[row][col]==target){
               System.out.println("Target found at " +"[" + row+","+col +"]");
               return true;
           }
           else if(target <matrix[row][col]){
               col--;
           }
           else{
               row++;
           }
       }
        System.out.println("not found");
       return false;
    }

    public static void main(String[] args) {
        int matrix[][]={ {1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 11;
        searchMatrix(matrix,11);
    }
}
