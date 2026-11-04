package main;

import fraction.FractionOperations;
import fraction.Fraction;
import fraction.CachedFraction;

public class Main {
    public static void main(String[] args) {

        // созд. обычной дроби
        Fraction fraction = new Fraction(1, 2);

        System.out.println("Обычная дробь: " + fraction);
        System.out.println("Значение дроби: " + fraction.getValue());

        // созд. дроби с кешированием
        CachedFraction cached = new CachedFraction(fraction);

        System.out.println("\nПроверка кеширования:");
        // 1 вызов - вычисление значения
        System.out.println(cached.getValue());
        // 2 вызов - получение значения из кеша
        System.out.println(cached.getValue());

        // меняем дробь
        System.out.println("\nМеняем дробь:");
        cached.setFraction(3, 4);
        System.out.println("Новая дробь: " + cached);

        // пров. кеш после изменения
        System.out.println("\nПовторная проверка кеширования:");
        // 1 вызов - новое вычисление
        System.out.println(cached.getValue());
        // 2 вызов - получение из кеша
        System.out.println(cached.getValue());

        // проверка equals()
        System.out.println("\nПроверка equals():");

        Fraction first = new Fraction(2, 3);
        Fraction second = new Fraction(2, 3);
        Fraction third = new Fraction(3, 4);

        System.out.println("2/3 и 2/3: " + first.equals(second));
        System.out.println("2/3 и 3/4: " + first.equals(third));
    }
}