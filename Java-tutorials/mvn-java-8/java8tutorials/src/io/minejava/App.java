public class App {
    public static void main(String[] args) throws Exception {
        IntegerStreamExample integerStreamExample = new IntegerStreamExample();
        var initValue = 0;
        var lastValue = 10;

        integerStreamExample.streamIntegerOperationsExample(initValue, lastValue);
        System.out.println("Hello, World!");
    }
}
