import java.util.stream.IntStream;

public class IntegerStreamsExample {

    public void streamImplExample(int initialValue, int endValue) {
        IntStream.range(initialValue, endValue).forEach(System.out::println);
        System.out.println();
    }

}
