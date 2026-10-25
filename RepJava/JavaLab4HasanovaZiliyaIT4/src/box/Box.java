//1.1
package box;

public class Box<T> {
    private T item;

    public Box() {
        item = null;
    }

    public void put(T item) {
        if (!isEmpty()) {
            throw new IllegalStateException(
                    "Коробка уже заполнена!"
            );
        }

        this.item = item;
    }

    public T take() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Коробка пуста!"
            );
        }

        T result = item;
        item = null;

        return result;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public boolean isFull() {
        return item != null;
    }

    // Для задания 2.2
    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "box.Box item = " + item;
    }
}
