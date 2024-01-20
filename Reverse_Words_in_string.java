public class Reverse_Words_in_string {
    public static String reverseWords(String s) {
        int i=0;
        String ans="";
        int n = s.length();
        while(i<n){
            String temp = "";
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            while(i<n && s.charAt(i) != ' '  ){
                temp += s.charAt(i);
                i++;
            }
            if(temp.length() >0){
                if(ans.length()==0){
                    ans+= temp;

                } else
                {ans = temp+" "+ans;}
            }

        }
        return ans;

    }


    public static void main(String[] args) {
        String s=new String("a good   example");
        System.out.println(reverseWords(s));
    }
}
