package ru.hasanova.main;

import ru.hasanova.city.City;
import ru.hasanova.fraction.Fraction;
import ru.hasanova.fraction.Fraction2;
import ru.hasanova.city.Route;
import ru.hasanova.sum.SumOperation;
import ru.hasanova.sum.Sum;
import ru.hasanova.calculator.Calculator;
import ru.hasanova.point.Point;

public class Main {
    public static void main(String[] args) {


        // 1.4, 3.1
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(-3, 4);
        Fraction f3 = new Fraction(3, -4);
        Fraction f4 = new Fraction(-3, -4);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);


        // 1.10
        // Созд. городов
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");

        // Доб-е дорог
        a.addPath(b, 100);
        a.addPath(c, 200);

        System.out.println("Изначальные дороги:");
        System.out.println(a);

        // Повторно доб. дорогу A-B. Новая дорога не создастся, изменится только стоимость
        a.addPath(b, 150);

        System.out.println("После повторного добавления A-B:");
        System.out.println(a);

        // Удаляю дорогу A-C
        a.removePath(c);

        System.out.println("После удаления A-C:");
        System.out.println(a);


        // 4.2
        Fraction2 fraction = new Fraction2(3, 2);

        System.out.println("Дробь: " + fraction);

        System.out.println("int: " + fraction.intValue());
        System.out.println("long: " + fraction.longValue());
        System.out.println("float: " + fraction.floatValue());
        System.out.println("double: " + fraction.doubleValue());

        Number number = fraction;
        System.out.println("Number: " + number.doubleValue());


        // 2.5
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        F.addPath(A, 10);
        F.addPath(E, 20);
        A.addPath(B, 15);
        B.addPath(D, 10);
        E.addPath(C, 5);
        C.addPath(D, 8);

        Route route = new Route(F, D);

        System.out.println("Маршрут: " + route);


        //5.1
        SumOperation operation = new Sum();

        double first = operation.sum(new double[]{2, 3.0 / 5, 2.3});
        double second = operation.sum(new double[]{3.6, 49.0 / 12, 3, 3.0 / 2});
        double third = operation.sum(new double[]{1.0 / 3, 1});

        System.out.println("1) " + first);
        System.out.println("2) " + second);
        System.out.println("3) " + third);


        //7.3
        System.out.println(Calculator.power(args[0], args[1]));


        //8.4
        // Создаю исх.точку
        Point original = new Point(3, 5);

        // Создаю копию исх.точки
        Point copy = original.clone();

        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);

        // Проверяю совп. координат
        System.out.println("Точки равны: "
                + original.equals(copy));

        // Проверяю, один ли это объект
        System.out.println("Это один объект: "
                + (original == copy));


    }
}





