package junit5tests;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.DayOfWeek;
import java.time.LocalDateTime;


public class DisableEnableTest {
    @Test
    @Disabled(value = "disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the first test");
    }
    @DisabledOnOs(value = OS.MAC, disabledReason = "Wanted to demo @DisabledOnOs")
    @Test
    void SecondTest(){
        System.out.println("This is the second test");
    }

    @Test
    @DisabledIfSystemProperty(named="env", matches="staging", disabledReason = "demo of @DisabledIfSystemProperty")
    void thirdTest(){
        System.out.println("This is the third test");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of @DisabledIf")
    void fourthTest(){
        System.out.println("This is the fourth test");
    }

    @Test
    void fifthTest(){
        System.out.println("This is the fourth test");
    }

    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }
}
