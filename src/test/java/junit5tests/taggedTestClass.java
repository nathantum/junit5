package junit5tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class taggedTestClass {
    @BeforeAll
    void beforeAll(){
        System.out.println("-- This is the before ALL method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("---- this is the before EACH method");
    }

    @AfterAll
    void afterAll(){
        System.out.println("-- This is after All method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("---- this is the after EACH method");
    }
    @Test
    @Tag("sanity")
    void firstMethod(){
        System.out.println("this is the first test method");
    }

    @Test
    @Tag("sanity")
    @Tag("acceptance")
    @DisplayName("US1234 - TC12 - This method is the second one")
    void secondMethod(){
        System.out.println("this is the second test method");
    }

    @Test
    @Tag("acceptance")
    @DisplayName("US1234 - TC12 - This method is the second one")
    void thirdMethod(){
        System.out.println("this is the third test method");
    }

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    @Tag("acceptance")
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

}
