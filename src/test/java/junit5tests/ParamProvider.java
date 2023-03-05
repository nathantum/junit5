package junit5tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {
    static Stream<Arguments> sourceStream_StringDouble(){
        return Stream.of(arguments("Carrots", 2.5), arguments("Cabbage", 6.9));
    }
}
