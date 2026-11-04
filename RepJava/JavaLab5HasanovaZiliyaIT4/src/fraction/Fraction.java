package fraction;

import java.util.Objects;

public class Fraction implements FractionOperations {

    private int numerator;
    private int denominator;

    // конструктор
    public Fraction(int numerator, int denominator) {
        setFraction(numerator, denominator);
    }

    // установка числителя и знаменателя
    @Override
    public void setFraction(int numerator, int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Знаменатель не может быть равен нулю!"
            );
        }

        // если знаменатель отриц. - знак в числитель
        if (denominator < 0) {

            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // получение числителя
    public int getNumerator() {
        return numerator;
    }

    // получение знаменателя
    public int getDenominator() {
        return denominator;
    }

    // получение вещественного значения дроби
    @Override
    public double getValue() {
        return (double) numerator / denominator;
    }

    // преобразование дроби в строку
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // сравнение дробей по числителю и знаменателю
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Fraction other = (Fraction) obj;

        return numerator == other.numerator && denominator == other.denominator;
    }

    // получение хеш-кода
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}