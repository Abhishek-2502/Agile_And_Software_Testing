package com.SeleniumMaven.hamercasttest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

//https://jsonpath.com/
//https://vogella.com/tutorials/Hamcrest/article.html
//https://jsonpath.com/


/*
* The following are the most important Hamcrest matchers:

allOf - matches if all matchers match (short circuits)

anyOf - matches if any matchers match (short circuits)

not - matches if the wrapped matcher doesn’t match and vice

equalTo - test object equality using the equals method

is - decorator for equalTo to improve readability

hasToString - test Object.toString

instanceOf, isCompatibleType - test type

notNullValue, nullValue - test for null

sameInstance - test object identity

hasEntry, hasKey, hasValue - test a map contains an entry, key or value

hasItem, hasItems - test a collection contains elements

hasItemInArray - test an array contains an element

hasProperty - checks if a Java Bean has a certain property can also check the value of this property

closeTo - test floating point values are close to a given value

greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo

equalToIgnoringCase - test string equality ignoring case

equalToIgnoringWhiteSpace - test string equality ignoring differences in runs of whitespace

containsString, endsWith, startsWith - test string matching

* */
class J1_Basics {

    @Test
    void demosInstanceOfTest() {
        // Fail
//        assertThat(Long.valueOf(1), instanceOf(Integer.class));
//        // shortcut for instanceOf
//        assertThat(Long.valueOf(1), isA(Integer.class));

        // Pass
        assertThat(Integer.valueOf(1), isA(Integer.class));
    }

    @Test
    void demoHamcrest() {
        boolean a = true;
        boolean b = true;

        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
        assertThat(a, is(b));
    }

    @Test
    void listShouldInitiallyBeEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));
        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));
        assertThat(list, containsInAnyOrder(2, 4, 5));
        assertThat(list, everyItem(greaterThan(1)));

    }

    @Test
    public void testRegularExpressionMatcher() throws Exception {
        String s ="aaabbbaaaa";
        assertThat(s, RegexMatcher.matchesRegex("a*b*a*"));
    }


}
