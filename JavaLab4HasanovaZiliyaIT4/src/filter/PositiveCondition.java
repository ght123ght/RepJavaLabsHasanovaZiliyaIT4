package filter;

public class PositiveCondition implements Condition<Integer> {

    @Override
    public boolean test(Integer value) {
        return value > 0;
    }
}