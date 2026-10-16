package ru.hasanova.sum;

public class Sum implements SumOperation {

    @Override
    public double sum(double[] numbers) {
        double result = 0;

        for (double number : numbers) {
            result += number;
        }

        return result;
    }
}

