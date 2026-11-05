package collection;

// создаю 2 пустых списка: для положительных и отрицательных чисел.

import java.util.ArrayList;
import java.util.List;

public class NumberGroupsFactory implements ResultFactory<List<List<Integer>>> {

    @Override
    public List<List<Integer>> create() {
        List<List<Integer>> groups = new ArrayList<>();

        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());

        return groups;
    }
}