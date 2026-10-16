package ru.hasanova.fraction;

public final class Fraction {

    private final int numerator;    //Тут
    private final int denominator;  //Тут

    //Тут: в конструкторе сначала подготавливаю значения, затем записываю в final поля
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель НЕ может быть нулём");
        }

        // Тут: если знаменатель отрицательный, переношу знак в числитель
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // Сокращаю дробь до сохранения значений
        int gcd = gcd(Math.abs(numerator), denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // НОД, алгоритм Евклида
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int num = this.numerator * other.denominator
                + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction sum(int value) {
        int num = this.numerator + value * this.denominator;
        return new Fraction(num, this.denominator);
    }

    public Fraction minus(Fraction other) {
        int num = this.numerator * other.denominator
                - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction minus(int value) {
        int num = this.numerator - value * this.denominator;
        return new Fraction(num, this.denominator);
    }

    public Fraction mul(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction mul(int value) {
        return new Fraction(this.numerator * value, this.denominator);
    }

    public Fraction div(Fraction other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }

    public Fraction div(int value) {
        return new Fraction(this.numerator, this.denominator * value);
    }
}

