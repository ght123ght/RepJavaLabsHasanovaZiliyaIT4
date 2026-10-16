package ru.hasanova.calculator;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Calculator {

    public static double power(String x, String y) {
        int numberX = parseInt(x);
        int numberY = parseInt(y);

        return pow(numberX, numberY);
    }
}
