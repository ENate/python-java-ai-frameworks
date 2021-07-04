import java.util.stream.IntStream;

public class IntergerStream {

    public void streamIntegerOperationsExample(int startValue, int endValue) {
        // Integer stream
        IntStream.range(startValue, endValue).forEach(System.out::println);
        System.out.println();
    }

}
