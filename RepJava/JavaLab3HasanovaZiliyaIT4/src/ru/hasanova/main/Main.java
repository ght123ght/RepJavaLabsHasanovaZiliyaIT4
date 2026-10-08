package ru.hasanova.main;

import ru.hasanova.city.City;
import ru.hasanova.fraction.Fraction;
import ru.hasanova.fraction.Fraction2;

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


    }
}

