package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.condition.DisabledOnOs;

import static org.junit.jupiter.api.Assumptions.*;

public class RepeatedTests {
    @RepeatedTest(5)
    void firstRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(value = 3, name = "Running repetition: {currentRepetition}." +
            " Total is: {totalRepetitions}")
    @DisplayName("This is  a repeated method")
    void secondRepeatedMethod(){
        System.out.println("We are repeating a new test");
    }

    @RepeatedTest(value = 3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo){
        System.out.println("this code will run at each repetition");
        assumingThat(repetitionInfo.getCurrentRepetition() == 3,
                ()-> System.out.println("This code only runs at repetition 3"));
    }


}
