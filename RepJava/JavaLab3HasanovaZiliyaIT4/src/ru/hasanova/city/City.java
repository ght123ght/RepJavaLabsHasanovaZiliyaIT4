package ru.hasanova.city;

public class City {
    private String name;

    private City[] connectedCities; // Массив городов
    private int[] costs;    // Массив стоимостей
    private int pathCount;  // Кол-во дорог

    // Кон-р
    public City(String name) {
        this.name = name;
        this.connectedCities = new City[10];
        this.costs = new int[10];
        this.pathCount = 0;
    }

    // Тут, доб. дороги: смена кост
    public void addPath(City city, int cost) {

        // Проверка, существует ли уже дорога в этот город
        for (int i = 0; i < pathCount; i++) {
            if (connectedCities[i] == city) {
                costs[i] = cost;
                return;
            }
        }

        // Если нет - доб.
        connectedCities[pathCount] = city;
        costs[pathCount] = cost;
        pathCount++;
    }

    // Тут, уд. дороги
    public void removePath(City city) {

        // Ищю нужный город
        for (int i = 0; i < pathCount; i++) {

            if (connectedCities[i] == city) {

                // Сдвиг ост. дорог на 1 поз. влево
                for (int j = i; j < pathCount - 1; j++) {
                    connectedCities[j] = connectedCities[j + 1];
                    costs[j] = costs[j + 1];
                }

                // Уменьшаю кол-во дорог
                pathCount--;

                return;
            }
        }
    }

    // Получ. названия города
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String result = name + ":\n";

        for (int i = 0; i < pathCount; i++) {
            result += "  " + connectedCities[i].getName()
                    + ": " + costs[i] + "\n";
        }

        return result;
    }
}