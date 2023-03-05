package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTests {
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"first" ,"second", "third"})
    void stringValues(String theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve, rodgers","captain, marvel","bucky, burns"})
    void csvSource_StringStrings(String param1, String parma2){
        System.out.println("param1 = " + param1 + ", parma2 = " + parma2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve, 24, true", "Elias, 56, false", "Wesley, 22, true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);

    }

    @ParameterizedTest
    @CsvSource(value = {"Davie Tammy, 'Ninja Turtle'", "Geiz Yuan, 'Cobra Squad'"})
    void csvSource_StringWithComma(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"Davies?Anthony", "John?Doe"}, delimiter = '?')
    void csvStringWithDiffDelimiter(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/shoppingList.csv", "src/test/resources/params/shoppingList2.csv"}, numLinesToSkip = 1)
    void csvFileSource_StringDoubleIntString(String name, double price, int qty, String uom,
                                             String provider){
        System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    };

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/shoppingList3.csv", numLinesToSkip = 1, delimiterString = "___")
    void csvFileSource_StringDoubleIntStringSpecialDelimeter(String name, double price, int qty, String uom,
                                             String provider){
        System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    };



}
