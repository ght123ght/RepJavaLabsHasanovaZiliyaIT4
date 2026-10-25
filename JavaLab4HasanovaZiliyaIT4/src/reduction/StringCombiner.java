package reduction;

public class StringCombiner implements Combiner<String> {

    @Override
    public String combine(String left, String right) {
        return left + right;
    }
}