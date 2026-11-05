package collection;

// группирует строки по количеству символов

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordGroupsWriter
        implements ResultWriter<Map<Integer, List<String>>, String> {

    @Override
    public void add(Map<Integer, List<String>> result, String value) {
        int length = value.length();

        if (!result.containsKey(length)) {
            result.put(length, new ArrayList<>());
        }

        result.get(length).add(value);
    }
}
