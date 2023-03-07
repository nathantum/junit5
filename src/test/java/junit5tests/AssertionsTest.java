package junit5tests;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void assertEqualsTest(){
        assertEquals("firstString", "secondString", "The string values are not equals");
    }

    @Test
    void assertEqualsListTest(){
        List<String> expectedValues = Arrays.asList("firstString","secondString","thirdString");
        List<String> actualValues = Arrays.asList("firstString","secondString","thirdString");
        assertEquals(expectedValues,actualValues);
    }

    @Test
    void assertArraysEqualsTest(){
        int[] expectedValues = {1,5,3};
        int[] actualValues = {1,2,3};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void assertTrueTest(){
        assertFalse(false);

        //assertTrue(false, "This boolean did not evaluate to true");
    }

    @Test
    void assertThrowsTest(){
        assertThrows(NullPointerException.class, null);
    }

    @Test
    void assertAllTest(){
        assertAll(
                ()-> assertEquals("firstString", "secondString", "The string values are not equals"),
                ()-> assertThrows(NullPointerException.class, null),
                ()-> assertTrue(false, "This boolean did not evaluate to true"));
    }

    @Test
    void assertForMapTest(){
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("firstKey", 1);
        theMap.put("secondKey",2);
        theMap.put("thirdKey", 3);

        assertThat(theMap, Matchers.hasValue(2));
        //assertThat(theMap, Matchers.hasKey("secondKey1"));
    }

    @Test
    void assertForList(){
        List<String> theList = Arrays.asList("firstString","secondString", "thirdString");
        assertThat(theList, hasItem("firstString"));
    }

    @Test
    void assertForAnyOf(){
        List<String> theList = Arrays.asList("firstString","secondString", "thirdString");
        assertThat(theList, anyOf(hasItem("firstString"), hasItem("anyString")));
    }

    @Test
    void assertForContainsAnyOrder(){
        List<String> theList = Arrays.asList("firstString","secondString", "thirdString");
        assertThat(theList, containsInAnyOrder("firstString","secondString", "thirdString"));
    }
}
