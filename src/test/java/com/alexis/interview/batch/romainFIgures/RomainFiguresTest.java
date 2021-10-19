package com.alexis.interview.batch.romainFIgures;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RomainFiguresTest {

    RomainFigures romainFigures = new RomainFigures();

    @Test
    public void should_return_I_when_1_submitted(){
        //GIVEN
        int input = 1;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("I");
    }

    @Test
    public void should_return_II_when_2_is_submitted(){
        // GIVEN
        int input = 2;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("II");
    }

    @Test
    public void should_return_III_when_3_is_submitted(){
        // GIVEN
        int input = 3;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("III");
    }

    @Test
    public void should_return_V_when_5_is_submitted(){
        // GIVEN
        int input = 5;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("V");
    }

    @Test
    public void should_return_VI_when_6_is_submitted(){
        // GIVEN
        int input = 6;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("VI");
    }

    @Test
    public void should_return_VII_when_7_is_submitted(){
        // GIVEN
        int input = 7;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("VII");
    }

    @Test
    public void should_return_X_when_10_is_submitted(){
        // GIVEN
        int input = 10;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("X");
    }

    @Test
    public void should_return_IV_when_4_is_submitted(){
        // GIVEN
        int input = 4;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("IV");
    }

    @Test
    public void should_return_IX_when_9_is_submitted(){
        // GIVEN
        int input = 9;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("IX");
    }

    @Test
    public void should_return_XX_when_20_is_submitted(){
        // GIVEN
        int input = 20;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("XX");
    }

    @Test
    public void should_return_XIX_when_19_is_submitted(){
        // GIVEN
        int input = 19;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("XIX");
    }

    @Test
    public void should_return_XXXIX_when_39_is_submitted(){
        // GIVEN
        int input = 39;
        // WHEN
        String result = romainFigures.convertFromArabicFigures(input);
        // THEN
        assertThat(result).isEqualTo("XXXIX");
    }

}