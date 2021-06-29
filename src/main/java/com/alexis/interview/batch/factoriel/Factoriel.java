package com.alexis.interview.batch.factoriel;

import org.springframework.stereotype.Component;

@Component
public class Factoriel {

    public int compute(int input){
        if (input == 0 ) return 1;
        int result = input;
        while(input>1){
            input = input-1;
            result = result * input;
        }
        return result;
    }
}
