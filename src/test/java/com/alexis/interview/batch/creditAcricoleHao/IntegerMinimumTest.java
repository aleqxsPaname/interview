package com.alexis.interview.batch.creditAcricoleHao;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class IntegerMinimumTest {

    public IntegerMinimum integerMinimum = new IntegerMinimum();

    @Test
    public void should_return_5(){
        //GIVEN
        int[] input = {1,4,3,6,2};

        //WHEN
        int result = integerMinimum.compute(input);

        //THEN
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void should_return_3(){
        //GIVEN
        int[] input = {1,2,4,5,6};

        //WHEN
        int result = integerMinimum.compute(input);

        //THEN
        assertThat(result).isEqualTo(3);
    }

}