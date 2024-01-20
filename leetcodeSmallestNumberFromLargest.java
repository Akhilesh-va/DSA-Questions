public class leetcodeSmallestNumberFromLargest {
    public static char SmallestNumber(char letters[],char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<letters[mid]){
                end = mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];

    }

    public static void main(String[] args) {
        char letters[]={'c','f','j'};
        char target = 'c';
        char ans = SmallestNumber(letters,target);
        System.out.println(ans);
    }
}
