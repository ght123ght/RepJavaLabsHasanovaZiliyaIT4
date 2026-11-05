package collection;

// распределяет числа по двум спискам

import java.util.List;

public class NumberGroupsWriter
        implements ResultWriter<List<List<Integer>>, Integer> {

    @Override
    public void add(List<List<Integer>> result, Integer value) {
        if (value > 0) {
            result.get(0).add(value);
        } else if (value < 0) {
            result.get(1).add(value);
        }
    }
}