package function;

public class AbsoluteValue implements Transformer<Integer, Integer> {

    @Override
    public Integer apply(Integer value) {
        if (value < 0) {
            return -value;
        }

        return value;
    }
}
