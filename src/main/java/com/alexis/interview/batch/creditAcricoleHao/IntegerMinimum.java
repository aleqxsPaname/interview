package com.alexis.interview.batch.creditAcricoleHao;

import java.util.Arrays;

public class IntegerMinimum {

    public int compute(int[] arraySubmitted){
        int minimum = 1;
        int maximum = 1;
        Arrays.sort(arraySubmitted);


        for(int i=1; i <= arraySubmitted.length; i++){
            System.out.println("in boucle");
            if(Arrays.asList(arraySubmitted).contains(i) == false){
                System.out.println("in the if");
                return i;
            }
        }
        return maximum;
    }




}
