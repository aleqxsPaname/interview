package com.alexis.interview.worldPopulation;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorldPopulationTest {

    @Before
    public void before(){
        System.out.println("HELLO INSIDE TESTS");
    }

    @Test
    public void should_return_true(){
        // GIVEN

        // WHEN

        // THEN
        assertThat(Boolean.TRUE).isTrue();

    }

}