package fraction;

import java.util.Objects;

public class CachedFraction implements FractionOperations {

    private final FractionOperations original;

    // кэшированное значение
    private Double cachedValue = null;

    // конструктор
    public CachedFraction(FractionOperations original) {
        this.original = Objects.requireNonNull(original);
    }

    // получение значения с использованием кэша
    @Override
    public double getValue() {

        if (cachedValue == null) {

            // если кэш пустой, вычисляю значение
            cachedValue = original.getValue();

            System.out.println("Вычислено новое значение");

        } else {

            // если значение уже есть, использую кэш
            System.out.println("Используется кэшированное значение");
        }

        return cachedValue;
    }

    // изменение дроби и очистка кэша
    @Override
    public void setFraction(int numerator, int denominator) {

        original.setFraction(numerator, denominator);

        // очищаю кэш после изменения дроби
        cachedValue = null;

        System.out.println("Кэш очищен");
    }

    @Override
    public String toString() {
        return original.toString();
    }
}
