package com.alexis.interview.batch.factoriel;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorielTest {

    @Autowired
    public Factoriel factoriel;

    @Test
    public void should_return_1_when_1_submitted(){
        //GIVEN
        int input = 1;

        //WHEN
        int output = factoriel.compute(input);

        //THEN
      //  assertThat(output).isEqualTo(1);
        assertThat(output).isEqualTo(1);
    }

    @Test
    public void should_return_2_when_2_submitted(){
        //GIVEN
        int input = 2;

        //WHEN
        int output = factoriel.compute(input);

        //THEN
        assertThat(output).isEqualTo(2);
    }

    @Test
    public void should_return_6_when_3_submitted(){
        //GIVEN
        int input = 3;

        //WHEN
        int output = factoriel.compute(input);

        //THEN
        assertThat(output).isEqualTo(6);
    }

    @Test
    public void should_return_24_when_4_submitted(){
        //GIVEN
        int input = 4;

        //WHEN
        int output = factoriel.compute(input);

        //THEN
        assertThat(output).isEqualTo(24);
        assertThat(output).isEqualTo(24);
    }

    @Test
    public void should_return_1_when_0_submitted(){
        //GIVEN
        int input = 0;

        //WHEN
        int output = factoriel.compute(input);

        //THEN
        assertThat(output).isEqualTo(1);
    }

}