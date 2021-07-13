package com.alexis.interview.batch.creditAcricoleHao;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class BatonTest {

    Baton baton = new Baton();


    @Test
    public void should_return_2_with_4_and_4(){
        //GIVEN
        int inputA = 4;
        int inputB = 4;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_return_2_with_5_and_5(){
        //GIVEN
        int inputA = 5;
        int inputB = 5;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_return_7_with_10_and_21(){
        //GIVEN
        int inputA = 10;
        int inputB = 21;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void should_return_5_when_11_and_13(){
        //GIVEN
        int inputA = 13;
        int inputB = 11;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(5);
    }


    @Test
    public void should_return_2_with_1_and_8(){
        //GIVEN
        int inputA = 1;
        int inputB = 8;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_return_0_with_2_and_1(){
        //GIVEN
        int inputA = 2;
        int inputB = 1;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void should_return_1_with_5_and_1(){
        //GIVEN
        int inputA = 5;
        int inputB = 1;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_return_10_with_30_and_10(){
        //GIVEN
        int inputA = 30;
        int inputB = 10;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void should_return_9_with_30_and_9(){
        //GIVEN
        int inputA = 30;
        int inputB = 9;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void should_return_1_with_2_and_2(){
        //GIVEN
        int inputA = 2;
        int inputB = 2;
        //WHEN
        int result = baton.solution(inputA, inputB);
        //THEN
        assertThat(result).isEqualTo(1);
    }

}