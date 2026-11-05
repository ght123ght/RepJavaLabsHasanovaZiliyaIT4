//2.2
package box;

public class BoxMaximum {

    public static double findMaximum(
            Box<? extends Number>... boxes) {

        if (boxes == null || boxes.length == 0) {
            throw new IllegalArgumentException(
                    "Набор коробок пуст!"
            );
        }

        Double maximum = null;

        for (Box<? extends Number> box : boxes) {
            if (box == null || box.isEmpty()) {
                continue; //пропуск
            }

            double value = box.getItem().doubleValue();

            if (maximum == null || value > maximum) {
                maximum = value;
            }
        }

        if (maximum == null) {
            throw new IllegalArgumentException(
                    "Нет заполненных коробок!"
            );
        }

        return maximum;
    }
}

