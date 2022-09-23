package javaStringsPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharsCount {

    public static void main(String args[]){
        printDistinctCharsCount("MyTestString1");
        printDistinctCharsCount("JavaStringPRactice");
    }


    public static void printDistinctCharsCount(String inputString){

        Map<Character,Integer> charsWithCountMap = new HashMap<>();

            //use map merge
        for(char c : inputString.toCharArray())
                charsWithCountMap.merge(c,1,Integer::sum);
        System.out.println(charsWithCountMap);


        //alternate method, without for loop
        List<Character> list = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        list.stream().forEach(c -> charsWithCountMap.merge(c,1,Integer::sum));
        System.out.println("alternate method");
        System.out.println(charsWithCountMap);
    }
}
