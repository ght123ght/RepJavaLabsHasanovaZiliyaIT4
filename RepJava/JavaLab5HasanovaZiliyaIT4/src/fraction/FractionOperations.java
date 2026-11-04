package fraction;
// 2 метода
public interface FractionOperations {

    // получение вещественного значения дроби
    double getValue();

    // установка числителя и знаменателя
    void setFraction(int numerator, int denominator);
}