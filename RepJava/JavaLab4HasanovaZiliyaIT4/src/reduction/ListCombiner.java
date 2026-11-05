package reduction;

import java.util.ArrayList;
import java.util.List;

public class ListCombiner implements Combiner<List<Integer>> {

    @Override
    public List<Integer> combine(
            List<Integer> left,
            List<Integer> right) {

        List<Integer> result = new ArrayList<>(left);
        result.addAll(right);

        return result;
    }
}
