package filter;

public interface Condition<T> {
    boolean test(T value);
}