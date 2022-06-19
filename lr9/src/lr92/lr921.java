package lr92;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class lr921 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a4", "a4");
        Stream<String> my_stream = collection.stream();
        System.out.println("Sorted = " + my_stream.sorted().distinct().toList());
    }
}
