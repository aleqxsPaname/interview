package com.alexis.interview.batch.primeNumbers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrimeNumberTest {

    @Autowired
    PrimeNumber primeNumber;

    @Test
    public void should_return_true_if_1_submitted(){
        //GIVEN
        int input = 1;

        //WHEN
        boolean result = primeNumber.isPrimeNumber(input);

        //THEN
        assertThat(result).isTrue();

    }

    @Test
    public void should_return_false_if_4_submitted(){
        //GIVEN
        int input = 4;

        //WHEN
        boolean result = primeNumber.isPrimeNumber(input);

        //THEN
        assertThat(result).isFalse();

    }

    @Test
    public void should_return_true_if_11_submitted(){
        //GIVEN
        int input = 11;

        //WHEN
        boolean result = primeNumber.isPrimeNumber(input);

        //THEN
        assertThat(result).isTrue();

    }

    @Test
    public void should_return_false_if_12_submitted(){
        //GIVEN
        int input = 12;

        //WHEN
        boolean result = primeNumber.isPrimeNumber(input);

        //THEN
        assertThat(result).isFalse();

    }

    @Test
    public void should_return_5_element(){
        //GIVEN
        int input = 9;

        //WHEN
        List<Integer> result = primeNumber.listPrimeNumberFrom(input);

        //THEN
        assertThat(result).isEqualTo(new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 5, 7)));
    }

}