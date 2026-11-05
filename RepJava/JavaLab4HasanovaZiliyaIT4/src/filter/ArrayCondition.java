package filter;

public class ArrayCondition implements Condition<int[]> {

    @Override
    public boolean test(int[] values) {
        for (int value : values) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }
}
