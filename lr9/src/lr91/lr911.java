package lr91;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class lr911 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a4");
        Stream<String> my_stream = collection.stream();
        System.out.println("Last = " + my_stream.skip(collection.size()-1).findFirst().get());
        my_stream = collection.stream();
        System.out.println("Third = " + my_stream.skip(2).findFirst().get());
    }
}
