package leetcode;

import java.util.HashMap;
import java.util.Objects;

public class IsValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println((new IsValidParentheses()).isValid(s));
    }

    public boolean isValid(String brackets) {
//        String parentheses = "()[]{}";

        HashMap<String, String> parentheses = new HashMap<>();
        parentheses.put("(","prnOpn");
        parentheses.put(")","prnClose");
        parentheses.put("[","sqrOpn");
        parentheses.put("]","sqrClose");
        parentheses.put("{","crlOpn");
        parentheses.put("}","crlClose");


        for (int i =0; i<brackets.length(); i++){
            if(Objects.equals(parentheses.get(brackets.charAt(i)), "(")){

            }
        }

        return false;
    }
}
