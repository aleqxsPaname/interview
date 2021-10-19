package com.alexis.interview.batch.romainFIgures;

public class RomainFigures {

    final int demiDizaineRomaine = 5;
    final int dizaineRomaine = 10;

    public String convertFromArabicFigures(int arabicFigure){
        String result = "";
        int remainToConvert = arabicFigure;

        while(remainToConvert >= dizaineRomaine - 1)
        if(remainToConvert >= dizaineRomaine - 1){
            if(remainToConvert == dizaineRomaine - 1) result = result + "IX";
            else{
                result = result + "X";
            }
            remainToConvert = remainToConvert - dizaineRomaine;
        }

        if(remainToConvert >= demiDizaineRomaine - 1){
            if(remainToConvert == demiDizaineRomaine - 1) result = "IV";
            else{
                result = result + "V";
            }
            remainToConvert = remainToConvert - demiDizaineRomaine;
        }
        for (int i = 1; i <= remainToConvert; i++) {
            result = result + "I"; }
        return result;
    }
}
