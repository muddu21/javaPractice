package javaStringsPractice;

public class ReverseString {

    public static void main(String args[]){
        reverseString("myReverseString");
        reverseString("ç©∆˙¨˚ø"); //special chars
    }


    public static void reverseString(String inputString){
        StringBuilder mySb = new StringBuilder(inputString);
        String result = mySb.reverse().toString();
        System.out.println(result);

    }
}
