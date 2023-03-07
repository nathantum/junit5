package junit5tests;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;

public class MiscTests {
    @Test
    @Timeout(5)
    void timeout() throws InterruptedException {
        System.out.println("This is the test with timeout set");
        sleep(6000);
    }

    @Test
    @Timeout(80)
    @DisplayName("This is nice method")
    @Tag("theTag")
    void annotatedMethod1(){
        System.out.println("This is an annotated method");
    }

    @CustomAnnotation
    void annotatedMethod2() throws InterruptedException {
        System.out.println("This is a custom annotated method");
        sleep(3000);
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class NestedTest{
        @BeforeAll
        void beforeAll(){
            System.out.println("BeforeAll in nested test");
        }

        @Test
        void nestedTestMethod(){
            System.out.println("This is nested test method");
        }
    }
}
