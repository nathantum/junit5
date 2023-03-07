package junit5tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    void assertEqualsTest(){
        Assertions.assertEquals("firstString", "secondString", "The string values are not equals");
    }
}
