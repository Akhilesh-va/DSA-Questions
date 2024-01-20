public class StringPalindrome {

    public static boolean stringPalindrome(String text ){


        int n = text.length();
        for(int i =0; i<=n/2;i++){
            if(Character.toLowerCase(text.charAt(i))!=Character.toLowerCase(text.charAt(n-1-i))){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str= "A man, a plan, a canal: Panama";
        String text = str.replaceAll("[^a-zA-Z0-9]", "");

       boolean ans= stringPalindrome(text);
        System.out.println(ans);
        System.out.println(text);

    }
}
