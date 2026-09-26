public class Fraction {

    private int numerator;     // Числитель
    private int denominator;   // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулём");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Сокращение дроби при создании
    }

    // Сокращение дроби
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    // НОД, алг Евклида
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
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction sum(int value) {
        int num = this.numerator + value * this.denominator;
        return new Fraction(num, this.denominator);
    }

    public Fraction minus(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
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


