package collection;

// создаёт пустой словарь для группировки строк по длине

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordGroupsFactory
        implements ResultFactory<Map<Integer, List<String>>> {

    @Override
    public Map<Integer, List<String>> create() {
        return new HashMap<>();
    }
}