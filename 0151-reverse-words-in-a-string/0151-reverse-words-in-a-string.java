class Solution {
    public String reverseWords(String s) {
                int i=0;
        String ans="";
        int n = s.length();
//step 1     Iterate over the string and check
        while(i<n){
            String temp = "";
//step 2    if sapce encountered then break the loop
            while(i<n && s.charAt(i)==' '){
                i++;
            }
 //step 3    if there are characters and then assign them to temp and move the iterator forward
            while(i<n && s.charAt(i) != ' '  ){
                temp += s.charAt(i);
                i++;
            }
 //step 4    now check if temp size >0
            if(temp.length() >0){
 //step 5    if ans size is 0 then assign temp to ans
                if(ans.length()==0){
                    ans+= temp;
 //step 6    else do ans = tmep+" "+ans 
                } else
                {ans = temp+" "+ans;}
            }

        }
        return ans;


    }
}