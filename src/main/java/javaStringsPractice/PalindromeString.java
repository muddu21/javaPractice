package javaStringsPractice;

public class PalindromeString {

    public static void main(String[] args) {

        checkPalindromeString("14641");
        checkPalindromeString("abcba");
        checkPalindromeString("ç∂©∂ç");
        checkPalindromeString("mudassar");
    }

    private static void checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();
        for(int i=0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length-i-1)) {
                result = false;
                break;
            }
        }
        System.out.println(input + " is palindrome = "+result);

    }

}