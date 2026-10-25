package filter;

public class StringCondition implements Condition<String> {

    @Override
    public boolean test(String value) {
        return value.length() >= 3;
    }
}