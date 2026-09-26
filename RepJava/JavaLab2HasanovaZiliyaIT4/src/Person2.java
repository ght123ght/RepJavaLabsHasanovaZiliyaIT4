public class Person2 {
    private Name name;   // Имя человека - объект Name
    private int height;   // Рост человека

    public Person2(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}


