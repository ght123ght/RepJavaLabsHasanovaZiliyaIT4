package collection;

// создаёт множество для хранения уникальных строк

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsFactory implements ResultFactory<Set<String>> {

    @Override
    public Set<String> create() {
        return new HashSet<>();
    }
}