public class Main {
    public static void main(String[] args) {
        // Задание 1.2)
        Person cleopatra = new Person("Клеопатра", 152);
        Person pushkin   = new Person("Пушкин", 167);
        Person vladimir  = new Person("Владимир", 189);

        System.out.println("\n");
        System.out.println(cleopatra.toString());
        System.out.println(pushkin.toString());
        System.out.println(vladimir.toString());
        System.out.println("\n");

        // Задание 1.3)
        // Только имя
        Name n1 = new Name("Клеопатра");
        // Фамилия + имя + отчество
        Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
        // Фамилия + имя
        Name n3 = new Name("Маяковский", "Владимир");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("\n");

        // Задание 2.2)
        Name k1 = new Name("Клеопатра");
        Name k2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name k3 = new Name("Маяковский", "Владимир");
        // Люди с этими именами
        Person2 p1 = new Person2(k1, 152);
        Person2 p2 = new Person2(k2, 167);
        Person2 p3 = new Person2(k3, 189);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("\n");

        // Задание 3.3), 4.8)
        // Создание городов
        City a = new City("a");
        City b = new City("b");
        City c = new City("c");
        City d = new City("d");
        City e = new City("e");
        City f = new City("f");

        // Добавление путей через первый конструктор
        a.addPath(b, 5);
        a.addPath(f, 1);
        a.addPath(d, 6);

        b.addPath(a, 5);
        b.addPath(c, 3);

        f.addPath(b, 1);
        f.addPath(e, 2);

        e.addPath(f, 2);

        c.addPath(b, 3);
        c.addPath(d, 4);

        d.addPath(a, 6);
        d.addPath(e, 2);
        d.addPath(c, 4);

        // Через второй конструктор
        // a
        City[] aCities = {b, f, d};
        int[] aCosts = {5, 1, 6};
        City a2 = new City("a", aCities, aCosts, 3);
        // b
        City[] bCities = {a, c};
        int[] bCosts = {5, 3};
        City b2 = new City("b", bCities, bCosts, 2);
        // c
        City[] cCities = {b, d};
        int[] cCosts = {3, 4};
        City c2 = new City("c", cCities, cCosts, 2);
        // d
        City[] dCities = {a, e, c};
        int[] dCosts = {6, 2, 4};
        City d2 = new City("d", dCities, dCosts, 3);
        // e
        City[] eCities = {f};
        int[] eCosts = {2};
        City e2 = new City("e", eCities, eCosts, 1);
        // f
        City[] fCities = {b, e};
        int[] fCosts = {1, 2};
        City f2 = new City("f", fCities, fCosts, 2);

        System.out.println("Через первый конструктор:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("\nЧерез второй конструктор:");
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println(f2);


        // Задание 5.5)
        Fraction f1 = new Fraction(1, 3);
        Fraction f22 = new Fraction(2, 3);

        Fraction f3 = new Fraction(2, 9);

        // Примеры операций
        System.out.println(f1 + " + " + f22 + " = " + f1.sum(f22));
        System.out.println(f1 + " - " + f22 + " = " + f1.minus(f22));
        System.out.println(f1 + " * " + f22 + " = " + f1.mul(f22));
        System.out.println(f1 + " / " + f22 + " = " + f1.div(f22));

        System.out.println(f1 + " + " + 2 + " = " + f1.sum(2));
        System.out.println(f1 + " - " + 2 + " = " + f1.minus(2));
        System.out.println(f1 + " * " + 2 + " = " + f1.mul(2));
        System.out.println(f1 + " / " + 2 + " = " + f1.div(2));

        Fraction result = f1.sum(f22).div(f3).minus(5);
        System.out.println("f1.sum(f2).div(f3).minus(5) = " + result);
    }
}




