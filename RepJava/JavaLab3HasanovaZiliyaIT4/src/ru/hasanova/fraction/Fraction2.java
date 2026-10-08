package ru.hasanova.fraction;

public final class Fraction2 extends Number {

    private final int numerator;
    private final int denominator;

    // Кон-р
    public Fraction2(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель НЕ может быть нулём");
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

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

    public Fraction2 sum(Fraction2 other) {
        int num = this.numerator * other.denominator
                + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction2(num, den);
    }

    public Fraction2 sum(int value) {
        int num = this.numerator + value * this.denominator;
        return new Fraction2(num, this.denominator);
    }

    public Fraction2 minus(Fraction2 other) {
        int num = this.numerator * other.denominator
                - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction2(num, den);
    }

    public Fraction2 minus(int value) {
        int num = this.numerator - value * this.denominator;
        return new Fraction2(num, this.denominator);
    }

    public Fraction2 mul(Fraction2 other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction2(num, den);
    }

    public Fraction2 mul(int value) {
        return new Fraction2(this.numerator * value, this.denominator);
    }

    public Fraction2 div(Fraction2 other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction2(num, den);
    }

    public Fraction2 div(int value) {
        return new Fraction2(this.numerator, this.denominator * value);
    }





    // Переопр. методы класса Number

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}