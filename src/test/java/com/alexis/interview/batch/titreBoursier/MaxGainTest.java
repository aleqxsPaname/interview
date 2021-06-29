package com.alexis.interview.batch.titreBoursier;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;



public class MaxGainTest {

    MaxGain maxGain = new MaxGain();

    @Test
    public void should_return_zero_when_cotation_are_same_all_day(){
        //GIVEN
        List<Integer> listOfCotationInDay = Arrays.asList(10, 10, 10, 10);
        //WHEN
        Integer maxGain = this.maxGain.process(listOfCotationInDay);
        //THEN
        assertThat(maxGain).isEqualTo(0);
    }

    @Test
    public void should_return_10_when_cotation_start_at_8_and_finished_at_18(){
        //GIVEN
        List<Integer> listOfCotationInDay = Arrays.asList(8, 10, 10, 18);
        //WHEN
        Integer maxGain = this.maxGain.process(listOfCotationInDay);
        //THEN
        assertThat(maxGain).isEqualTo(10);
    }


    @Test
    public void should_return_20_when_PLZ_SEE_GIVEN(){
        //GIVEN
        List<Integer> listOfCotationInDay = Arrays.asList(10, 10, 30, 18);
        //WHEN
        Integer maxGain = this.maxGain.process(listOfCotationInDay);
        //THEN
        assertThat(maxGain).isEqualTo(20);
    }

    @Test
    public void should_return_minus_1_when_PLZ_SEE_GIVEN(){
        //GIVEN
        List<Integer> listOfCotationInDay = Arrays.asList(30, 29, 10, 8);
        //WHEN
        Integer maxGain = this.maxGain.process(listOfCotationInDay);
        //THEN
        assertThat(maxGain).isEqualTo(-1);
    }

    @Test
    public void should_return_90_when_PLZ_SEE_GIVEN(){
        //GIVEN
        List<Integer> listOfCotationInDay = Arrays.asList(30, 29, 10, 100, 8);
        //WHEN
        Integer maxGain = this.maxGain.process(listOfCotationInDay);
        //THEN
        assertThat(maxGain).isEqualTo(90);
    }

}