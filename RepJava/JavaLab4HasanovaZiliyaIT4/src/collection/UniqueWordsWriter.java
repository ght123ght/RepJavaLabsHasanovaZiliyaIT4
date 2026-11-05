package collection;

// добавляет строки в множество, повторения автоматически не сохраняются

import java.util.Set;

public class UniqueWordsWriter
        implements ResultWriter<Set<String>, String> {

    @Override
    public void add(Set<String> result, String value) {
        result.add(value);
    }
}
