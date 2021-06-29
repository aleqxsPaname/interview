package com.alexis.interview.batch.palindrome;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Palindrome {

    public boolean check(String input){
        String inputReversed = reverse(input);
        if(inputReversed.equals(input)){
            return true;
        }
        return false;
    }

    private List<Character> convertIntoChar(String str){
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public String reverse(String str){
        String result = "";
        List<Character> chars2 = new ArrayList<>();
        List<Character> chars = convertIntoChar(str);
        System.out.println(chars.size());
        for(int i=chars.size()-1; i>=0;i-- ){
            result = result + chars.get(i);
            System.out.println("result in loop = " + result);
        }
        return result;
    }

}
