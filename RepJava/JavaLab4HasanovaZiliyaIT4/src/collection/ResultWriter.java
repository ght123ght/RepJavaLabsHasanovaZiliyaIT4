package collection;
// интерфейс для доб. элементов в результат
public interface ResultWriter<R, T> {
    void add(R result, T value);
}