package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {
    @Test
    void firstMethod(){
        System.out.println("this is the first test method");
    }

    @Test
    @DisplayName("US1234 - TC12 - This method is the second one")
    void secondMethod(){
        System.out.println("this is the second test method");
    }
}
