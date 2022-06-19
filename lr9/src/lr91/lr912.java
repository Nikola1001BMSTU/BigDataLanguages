package lr91;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class lr912 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a4", "a4");
        Stream<String> my_stream = collection.stream();
        System.out.println("first = " + my_stream.findFirst().get());
        my_stream = collection.stream();
        System.out.println("Template 4 = " + my_stream.filter(s -> s.contains("4")).toList());
    }
}
