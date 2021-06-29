package com.alexis.interview.batch.primeNumbers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeNumber {

    public List<Integer> listPrimeNumberFrom(int maxNumber){
        List<Integer> results = new ArrayList<>();
        if(maxNumber < 1) return results;
        int start = 1;
        while(start<=maxNumber){
            if(isPrimeNumber(start)){
                results.add(start);
            }
            start++;
        }
        System.out.println("results = " + results);
        return results;
    }

    public boolean isPrimeNumber(int input){
        // verifie qu'il est divisible par un nombre autre que lui meme et 1.
        int diviseur = input;
        while(diviseur>=2) {
            diviseur = diviseur - 1;
       //     System.out.println("diviseur=" + diviseur);
            if (diviseur != input && diviseur != 1) {
                if (isInputDivisibleParDiviseur(input, diviseur)) {
               //     System.out.println("input = " + input + "diviseur=" + diviseur);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isInputDivisibleParDiviseur(int input, int diviseur){
        return (input % diviseur == 0);
    }
}
