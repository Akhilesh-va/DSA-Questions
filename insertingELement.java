public class insertingELement {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int size = a.length;
        int newa[]=new int[size+1];
        int elem=9;
        for (int i = 0; i < size; i++) {
            newa[i]=a[i];

        }
        newa[3]=elem;
        for (int i = 0; i < newa.length; i++) {
            System.out.print(newa[i]+" ");

        }
    }
}
