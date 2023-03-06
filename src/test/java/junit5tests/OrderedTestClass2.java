package junit5tests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestClass2 {
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
    void firstMethod(){
        System.out.println("this is the first test method");
    }

    @Test
    @DisplayName("US1234 - TC12 - This method is the second one")
    void secondMethod(){
        System.out.println("this is the second test method");
    }

    @Test
    @Order(1)
    void thirdMethod(){
        System.out.println("this is the third test method");
    }
}
