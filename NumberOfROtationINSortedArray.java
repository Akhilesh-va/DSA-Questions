public class NumberOfROtationINSortedArray {

        public static int findmin(int arr[]){
            int index =-1;
            int start=0;
            int end=arr.length-1;
            int ans = Integer.MAX_VALUE;
            while(start<=end){
                int mid=( start+end)/2;
                if(arr[start]<arr[end]){
                    if (arr[start] < ans) {


                    index=start;
                    ans=arr[start];}
                    break;
                }
                if(arr[start]<=arr[mid]){
                    if(arr[start]<ans){
                        index=start;
                        ans=arr[start];
                    }
                    start=mid+1;
                }
                else{
                    if(arr[mid]<ans){
                        index=mid;
                        ans=arr[mid];
                    }
                    end=mid-1;
                }
            }
            return index;
        }


        public static void main(String[] args) {
            int arr[]={4,5,1,2,3};
            System.out.println(findmin(arr));
        }
    }


