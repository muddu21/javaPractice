package com.javapractice.javapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JavaPracticeApplication {

    public static void main(String[] args) {
       String strAnagram1 = "triangle";
       String strAnagram2 = "integral";

       if(strAnagram1.length() == strAnagram2.length()){

           //convert string to char array
           char[] charArray1 = strAnagram1.toCharArray();
           char[] charArray2 = strAnagram2.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);

           //compare the sorted arrays
           boolean result = Arrays.equals(charArray1,charArray2);

           if (result){
               System.out.println("Strings are Anagram");
           }else {
               System.out.println("Strings are not a anagram");
           }
       }else{
           System.out.println("Strings are not a anagram");
       }
        
    }

}
