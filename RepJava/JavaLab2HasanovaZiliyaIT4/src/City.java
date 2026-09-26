public class City {
    private String name;

    private City[] connectedCities;   // Массив городов
    private int[] costs;              // Массив стоимостей
    private int pathCount;            // Количество путей

    // Конструктор 1 - только название
    public City(String name) {
        this.name = name;
        this.connectedCities = new City[10]; // фиксированный размер
        this.costs = new int[10];
        this.pathCount = 0;
    }

    // Конструктор 2 - название + массивы путей
    public City(String name, City[] cities, int[] costs, int count) {
        this.name = name;
        this.connectedCities = cities;
        this.costs = costs;
        this.pathCount = count;
    }

    // Добавление пути
    public void addPath(City city, int cost) {
        connectedCities[pathCount] = city;
        costs[pathCount] = cost;
        pathCount++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String result = name + ":\n";
        for (int i = 0; i < pathCount; i++) {
            result += "  " + connectedCities[i].getName() + ": " + costs[i] + "\n";
        }
        return result;
    }
}
