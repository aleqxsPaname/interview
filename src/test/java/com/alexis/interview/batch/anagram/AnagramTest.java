package com.alexis.interview.batch.anagram;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {

    @Autowired
    public Anagram anagram;

    @Test
    public void should_return_true_when_A_is_submited(){
        //GIVEN
        String input = "A";
        //WHEN
        boolean result = anagram.check(input);
        //THEN
        assertThat(result).isTrue();
    }

}