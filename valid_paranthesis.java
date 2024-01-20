//import java.util.Stack;
//
//public class valid_paranthesis {
//    public static boolean paranthesis(String s){
//
//        Stack stk = new Stack<>();
//        int n = s.length();
//        for(char i :s.toCharArray()) {
//            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
//                stk.push(s.charAt(i));
//            }
//            else{
//                if(stk.empty()){
//                    return false;
//                }
//                else{
//                    char c = (char)stk.pop();
////                    if((s.charAt(i)==')' && c='(') || (s.charAt(i)=='}' && c='{') || (s.charAt(i)=='[' && c=']')){
//
//                    }
//                    else {
//                        return false;
//                    }
//                    }
//                }
//            }
//        return stk.isEmpty();
//        }
//    public static void main (String[] args) {
//
//        String s="()[{}()]";
//        if(paranthesis(s)==true)
//            System.out.println("True");
//        else
//            System.out.println("False");
//    }
//}
//
