package com.alexis.interview.batch.fizzBuzz;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FizzBuzz {

    // Given a table of number
    // FizzBuzz will return a table of String,
    // each String will be :
    // - Fizz if the number is divisible by 3
    // - Buzz if the number is divisible by 5
    // - the number if it is neither divisible by 3 or by


    public String[] compute(int[] values){

        List<String> resultTemp = new ArrayList<>();

        for(int value:values){
            resultTemp.add(computeSingleValue(value));
        }
        String[] result = new String[resultTemp.size()];
        return resultTemp.toArray(result);
    }

    public String computeSingleValue(int singleValue){

        String result = String.valueOf(singleValue);

        if(singleValue % 5 == 0){
            result = "Buzz";
        }
        if(singleValue % 3 == 0){
            result = "Fizz";
        }
        if(singleValue % 5 == 0 && singleValue % 3 == 0){
            result = "FizzBuzz";
        }

        return result;
    }
}
