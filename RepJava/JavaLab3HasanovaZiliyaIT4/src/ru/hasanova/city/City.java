
package ru.hasanova.city;

public class City {
    private String name;

    private City[] connectedCities;
    private int[] costs;
    private int pathCount;

    // Конструктор города
    public City(String name) {
        this.name = name;
        this.connectedCities = new City[10];
        this.costs = new int[10];
        this.pathCount = 0;
    }

    // Добавление дороги
    public void addPath(City city, int cost) {
        for (int i = 0; i < pathCount; i++) {
            if (connectedCities[i] == city) {
                costs[i] = cost;
                return;
            }
        }

        connectedCities[pathCount] = city;
        costs[pathCount] = cost;
        pathCount++;
    }

    // Удаление дороги
    public void removePath(City city) {
        for (int i = 0; i < pathCount; i++) {
            if (connectedCities[i] == city) {
                for (int j = i; j < pathCount - 1; j++) {
                    connectedCities[j] = connectedCities[j + 1];
                    costs[j] = costs[j + 1];
                }

                pathCount--;
                return;
            }
        }
    }

    // Получение названия города
    public String getName() {
        return name;
    }

    // ЭТО Получение количества дорог
    public int getPathCount() {
        return pathCount;
    }

    // ЭТО Получение города по номеру дороги
    public City getConnectedCity(int index) {
        return connectedCities[index];
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
