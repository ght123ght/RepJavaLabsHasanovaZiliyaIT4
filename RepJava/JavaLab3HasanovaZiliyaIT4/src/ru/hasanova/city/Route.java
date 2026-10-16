package ru.hasanova.city;

public class Route {
    private City start;
    private City end;

    public Route(City start, City end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Города не могут быть null");
        }
        this.start = start;
        this.end = end;
    }

    public void setStart(City start) {
        if (start == null) {
            throw new IllegalArgumentException("Город не может быть null");
        }
        this.start = start;
    }

    public void setEnd(City end) {
        if (end == null) {
            throw new IllegalArgumentException("Город не может быть null");
        }
        this.end = end;
    }

    public City[] getRoute() {
        City[] route = new City[100];

        int length = findRoute(start, route, 0);

        if (length == 0) {
            return new City[0];
        }

        City[] result = new City[length];

        for (int i = 0; i < length; i++) {
            result[i] = route[i];
        }

        return result;
    }

    private int findRoute(City current, City[] route, int count) {
        for (int i = 0; i < count; i++) {   // Проверка на циклы
            if (route[i] == current) {
                return 0;
            }
        }

        route[count] = current;
        count++;

        if (current == end) {
            return count;
        }

        for (int i = 0; i < current.getPathCount(); i++) {  //Выбор дороги
            City next = current.getConnectedCity(i);

            int result = findRoute(next, route, count);

            if (result != 0) {
                return result;
            }
        }

        return 0;
    }

    @Override
    public String toString() {
        City[] route = getRoute();

        if (route.length == 0) {
            return "Маршрут не найден";
        }
        String result = "";

        for (int i = 0; i < route.length; i++) {
            result += route[i].getName();

            if (i < route.length - 1) {
                result += " -> ";
            }
        }

        return result;
    }
}

