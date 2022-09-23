package javaStringsPractice;

public class RemoveCharFromString {
    public static void main(String args[]){
        removeCharFromString("sahahfoelcelec",'c');
        removeCharFromString("mudassar",'s');
        removeCharFromString("243432325325",'3');
    }

    private static void removeCharFromString(String myInputString, char myChar){
        String result = myInputString.replaceAll(String.valueOf(myChar), "");
        System.out.println(result);

    }
}
