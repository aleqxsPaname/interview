package com.alexis.interview.dictionary;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DictionaryTest {

    private Dictionary dict;

    @Before
    public void initialize(){
        dict = new Dictionary("Example");
    }

    @Test
    public void testDictionaryName(){
        assertThat(dict.getName(), is(equalTo("Example")));
    }

    @Test
    public void testDictionaryVoid(){
        assertThat(dict.isEmpty(), is(true));
        dict.addTranslation("empty", "vide");
        assertThat(dict.isEmpty(), is(false));
    }

    @Test
    public void  testTwoTranslations(){
        dict.addTranslation("contre", "against");
        dict.addTranslation("hello", "salut");
        assertThat((Collection<String>) dict.getMultipleTranslations("contre"))
                .contains("against");
        assertThat((Collection<String>) dict.getMultipleTranslations("hello"))
                .contains("salut");
    }

    @Test
    public void testMultipleTranslations(){
        dict.addTranslation("smart", "intelligent");
        dict.addTranslation("smart", "chic");
        assertThat((Collection<String>) dict.getMultipleTranslations("smart"))
                .contains("intelligent", "chic");
    }

}