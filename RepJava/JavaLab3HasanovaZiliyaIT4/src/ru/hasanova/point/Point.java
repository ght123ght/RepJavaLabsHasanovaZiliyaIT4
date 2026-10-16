package ru.hasanova.point;


public class Point {
    private int x;
    private int y;

    // Задание 1.4.1: конструктор принимает обе координаты
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Вывод координат точки
    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }

    // Задание 2.6.2: сравнение точек по координатам
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Point)) {  // instanceof - пр. типа объекта (отн. поинт)
            return false;
        }

        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    // Задание 8: создание копии точки
    @Override
    public Point clone() {
        return new Point(this.x, this.y);
    }

}
