package com.alexis.interview.fizzBuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzTest {

    @Autowired
    private FizzBuzz fizzBuzz;

   /* @Before
    public void before(){
        fizzBuzz = new FizzBuzz();
    }*/


    @Test
    public void should_return_fizz_if_3_is_submitted(){

        // GIVEN
        String Expected = "Fizz";
        int toBeComputed = 3;

        // WHEN
        String result = fizzBuzz.computeSingleValue(toBeComputed);

        // THEN
        assertThat(result).isEqualTo(Expected);
    }


    @Test
    public void should_return_buzz_if_5_is_submitted(){

        // GIVEN
        String Expected = "Buzz";
        int toBeComputed = 5;

        // WHEN
        String result = fizzBuzz.computeSingleValue(toBeComputed);

        // THEN
        assertThat(result).isEqualTo(Expected);
    }

    @Test
    public void should_return_number_if_2_is_submitted(){

        // GIVEN
        String Expected = "2";
        int toBeComputed = 2;

        // WHEN
        String result = fizzBuzz.computeSingleValue(toBeComputed);

        // THEN
        assertThat(result).isEqualTo(Expected);
    }

    @Test
    public void should_return_fizz_if_divisible_by_3(){

        // GIVEN
        String expected = "Fizz";
        int toBeComputed = 9;

        // WHEN
        String result = fizzBuzz.computeSingleValue(toBeComputed);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_fizz_if_divisible_by_5(){

        // GIVEN
        String expected = "Buzz";
        int toBeComputed = 10;

        // WHEN
        String result = fizzBuzz.computeSingleValue(toBeComputed);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_fizz_buzz_if_3_5_submitted(){

        // GIVEN
        String[] expected = {"Fizz" , "Buzz"};
        int[] submittedArray = {3, 5};

        // WHEN
        String[] result = fizzBuzz.compute(submittedArray);

        // THEN
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void should_return_fizz_2_buzz_fizz_buzz_if_3_2_5_9_20_submitted(){

        // GIVEN
        String[] expected = {"Fizz" , "2", "Buzz", "Fizz", "Buzz"};
        int[] submittedArray = {3, 2, 5, 9, 20};

        // WHEN
        String[] result = fizzBuzz.compute(submittedArray);

        // THEN
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void should_return_fizz_2_buzz_fizz_fizzbuzz_buzz_if_3_2_5_9_15_20_submitted(){

        // GIVEN
        String[] expected = {"Fizz" , "2", "Buzz", "Fizz", "FizzBuzz", "Buzz"};
        int[] submittedArray = {3, 2, 5, 9, 15, 20};

        // WHEN
        String[] result = fizzBuzz.compute(submittedArray);

        // THEN
        assertThat(result).isEqualTo(expected);

    }

}