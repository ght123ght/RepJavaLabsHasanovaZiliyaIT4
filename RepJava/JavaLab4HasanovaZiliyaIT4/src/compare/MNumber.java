//Класс для 1.3

package compare;

public class MNumber implements Comparable<Integer> {

    private int number;

    public MNumber(int number) {
        this.number = number;
    }

    @Override
    public int compare(Integer object) {
        return Integer.compare(number, object);
    }
}
