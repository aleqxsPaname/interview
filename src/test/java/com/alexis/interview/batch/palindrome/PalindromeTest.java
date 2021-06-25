package com.alexis.interview.batch.palindrome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PalindromeTest {

    @Autowired
    Palindrome palindrome;

    @Test
    public void should_return_true_if_A_is_submitted(){
        //GIVEN
        String input = "A";

        //WHEN
        boolean result = palindrome.check(input);

        //THEN
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_if_AB_is_submitted(){
        //GIVEN
        String input = "AB";

        //WHEN
        boolean result = palindrome.check(input);

        //THEN
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_if_ABBA_is_submitted(){
        //GIVEN
        String input = "ABBA";

        //WHEN
        boolean result = palindrome.check(input);

        //THEN
        assertThat(result).isTrue();
    }


    @Test
    public void should_return_CBA_if_ABC_submitted(){
        //GIVEN
        String input = "ABC";

        //WHEN
        String result = palindrome.reverse(input);

        //THEN
        assertThat(result).isEqualTo("CBA");
    }

}