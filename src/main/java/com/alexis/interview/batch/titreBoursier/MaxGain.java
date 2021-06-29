package com.alexis.interview.batch.titreBoursier;

// INTITULE EXERCICE
/////////////////////////
// soit T, les cotations d'un titre au cours de la journée
// Calculer le profit maximum (ou la perte minimum) qu'il etait possible de faire durant la journée
// SAMPLE OF VALUES
// T= {20, 25, 40, 3, 22} ---> 40 - 20 = 20
// T= {10, 9, 6, 14, 8, 42, 12 } ---> 42 - 6 = 36


import java.util.List;

public class MaxGain {

    private int numberOfTests = 0;

    public Integer process(List<Integer> input){

        Integer marge;
        Integer maxMarge = null;

        for(int buyInstant=0; buyInstant<input.size(); buyInstant++){
            for(int sellInstant=buyInstant+1; sellInstant<input.size();sellInstant++){
                marge = input.get(sellInstant) - input.get(buyInstant);
                maxMarge = maxOf(marge, maxMarge);
                numberOfTests++;
            }
        }
        return maxMarge;
    }

    public Integer maxOf(Integer input, Integer maxMarge){
        if(maxMarge==null) maxMarge = input;
        if(input > maxMarge) {
            maxMarge = input;
        }
        return maxMarge;
    }

}
