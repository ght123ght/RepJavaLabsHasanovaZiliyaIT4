package function;

public class ArrayMaximum implements Transformer<int[], Integer> {

    @Override
    public Integer apply(int[] value) {
        if (value.length == 0) {
            throw new IllegalArgumentException(
                    "Массив не должен быть пустым"
            );
        }

        int max = value[0]; // Обращение в перврому элементу массива

        for (int i = 1; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }

        return max;
    }
}