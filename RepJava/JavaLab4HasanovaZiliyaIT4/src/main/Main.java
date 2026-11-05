package main;

import java.util.*;

import box.Box;
import box.BoxMaximum;

import compare.Comparable;
import compare.MNumber;

import filter.ArrayCondition;
import filter.Condition;
import filter.PositiveCondition;
import filter.StringCondition;

import function.Transformer;
import function.StringLength;
import function.AbsoluteValue;
import function.ArrayMaximum;

import reduction.Combiner;
import reduction.IntegerSum;
import reduction.ListCombiner;
import reduction.StringCombiner;

import collection.ResultFactory;
import collection.ResultWriter;
import collection.NumberGroupsFactory;
import collection.NumberGroupsWriter;
import collection.UniqueWordsFactory;
import collection.UniqueWordsWriter;
import collection.WordGroupsFactory;
import collection.WordGroupsWriter;


public class Main {

    public static void main(String[] args) {

        //1.1
        Box<Integer> box = new Box<>();

        box.put(3);

        System.out.println("Коробка создана");
        System.out.println("Содержимое: " + box);
        System.out.println("Коробка заполнена: " + box.isFull());

        takeAndPrint(box);

        System.out.println("Коробка пуста: " + box.isFull());


        // 1.3
        MNumber n = new MNumber(10);

        System.out.println(n.compare(5));
        System.out.println(n.compare(10));
        System.out.println(n.compare(15));


        //2.2
        Box<Integer> box1 = new Box<>();
        box1.put(15);

        Box<Double> box2 = new Box<>();
        box2.put(27.8);

        Box<Float> box3 = new Box<>();
        box3.put(12.5f);

        Box<Long> box4 = new Box<>();
        box4.put(100L);

        // Вызываю поиск максимума
        double maximum = BoxMaximum.findMaximum(
                box1, box2, box3, box4
        );

        System.out.println("Коробки:");
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);

        System.out.println(
                "Максимальное значение: " + maximum
        );


        // 3.1
        System.out.println("\nЗадание 3.1");
        // Длина строк
        List<String> words = Arrays.asList(
                "qwerty", "asdfg", "zx"
        );

        List<Integer> lengths = transform(
                words, new StringLength()
        );

        System.out.println("Длины строк: " + lengths);

        // Модули чисел
        List<Integer> numbers = Arrays.asList(1, -3, 7);

        List<Integer> absoluteNumbers = transform(
                numbers, new AbsoluteValue()
        );

        System.out.println("Модули чисел: " + absoluteNumbers);

        // Максимумы массивов
        List<int[]> arrays = Arrays.asList(
                new int[]{2, 8, 4},
                new int[]{-5, -1, -9},
                new int[]{10, 3, 7}
        );

        List<Integer> maximums = transform(
                arrays, new ArrayMaximum()
        );

        System.out.println("Максимумы массивов: " + maximums);


        // 3.2
        System.out.println("\nЗадание 3.2");
        // Фильтрация строк
        List<String> strings = new ArrayList<>(
                Arrays.asList("qwerty", "asdfg", "zx"));

        List<String> filteredStrings =
                filterValues(strings, new StringCondition());

        System.out.println("Строки, в которых более трех символов:");
        System.out.println(filteredStrings);

        // Фильтрация положительных чисел
        List<Integer> num = new ArrayList<>(
                Arrays.asList(1, -3, 7));

        List<Integer> filteredNumbers =
                filterValues(num, new PositiveCondition());

        System.out.println("Положительные числа:");
        System.out.println(filteredNumbers);

        // Фильтрация массивов
        List<int[]> arr = new ArrayList<>();

        arr.add(new int[]{-1, -2, 0});
        arr.add(new int[]{1, -3, 0});
        arr.add(new int[]{-5, -4, -1});
        arr.add(new int[]{0, 0, -2});

        List<int[]> filteredArrays =
                filterValues(arrays, new ArrayCondition());

        System.out.println("Массивы без положительных элементов:");

        for (int[] array : filteredArrays) {
            System.out.println(Arrays.toString(array));
        }


        // 3.3
        System.out.println("\nЗадание 3.3");
        // Объединение строк
        List<String> wordss = List.of(
                "qwerty", "asdfg", "zx"
        );

        String text = reduce(
                wordss,
                "",
                new StringCombiner()
        );

        System.out.println(
                "Объединённая строка: " + text
        );

        // Сумма чисел
        List<Integer> numb = List.of(1, -3, 7);

        Integer sum = reduce(
                numb,
                0,
                new IntegerSum()
        );

        System.out.println(
                "Сумма чисел: " + sum
        );

        // Общее количество элементов во вложенных списках
        List<List<Integer>> groups = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );

        List<Integer> allElements = reduce(
                groups,
                new ArrayList<Integer>(),
                new ListCombiner()
        );

        System.out.println(
                "Количество элементов во вложенных списках: "
                        + allElements.size()
        );

        // Проверка пустых списков
        List<String> emptyWords = List.of();
        List<Integer> emptyNumbers = List.of();
        List<List<Integer>> emptyGroups = List.of();

        String emptyText = reduce(
                emptyWords,
                "",
                new StringCombiner()
        );

        Integer emptySum = reduce(
                emptyNumbers,
                0,
                new IntegerSum()
        );

        List<Integer> emptyResult = reduce(
                emptyGroups,
                new ArrayList<Integer>(),
                new ListCombiner()
        );

        System.out.println(
                "Результат для пустого списка строк: "
                        + emptyText
        );

        System.out.println(
                "Результат для пустого списка чисел: "
                        + emptySum
        );

        System.out.println(
                "Количество элементов в пустом списке списков: "
                        + emptyResult.size()
        );


        // 3.4

        // ЗАДАНИЕ 1. Разделение чисел на положительные и отрицательные
        List<Integer> numbe = Arrays.asList(1, -3, 7);

        List<List<Integer>> numberGroups = collectValues(
                numbe,
                new NumberGroupsFactory(),
                new NumberGroupsWriter()
        );

        System.out.println("1. Группы чисел:");
        System.out.println(numberGroups);


        // ЗАДАНИЕ 2. Группировка строк по длине
        List<String> worde = Arrays.asList(
                "qwerty", "asdfg", "zx", "qw"
        );

        Map<Integer, List<String>> wordGroups = collectValues(
                worde,
                new WordGroupsFactory(),
                new WordGroupsWriter()
        );

        System.out.println("\n2. Группы строк по длине:");
        System.out.println(wordGroups);


        // ЗАДАНИЕ 3. Удаление повторяющихся строк
        List<String> repeatedWords = Arrays.asList(
                "qwerty", "asdfg", "qwerty", "qw"
        );

        Set<String> uniqueWords = collectValues(
                repeatedWords,
                new UniqueWordsFactory(),
                new UniqueWordsWriter()
        );

        System.out.println("\n3. Уникальные строки:");
        System.out.println(uniqueWords);


    }


    // Метод для 1.1
    public static void takeAndPrint(Box<Integer> box) {
        Integer number = box.take();

        System.out.println("Извлечённое число: " + number);
    }


    // Метод для 3.1
    public static <T, P> List<P> transform(
            List<T> source, // список, в котором хранятся исх элементы
            Transformer<T, P> transformer) { //  интерефейс, передаем  объект класса, который реализует этот интерфейс

        List<P> result = new ArrayList<>(); // созд новый объект, список на осонове класса эррэйлист

        for (T value : source) { // переб исх список
            P convertedValue = transformer.apply(value);
            result.add(convertedValue);
        }
        return result;
    }


    // Метод для 3.2
    public static <T> List<T> filterValues(
            List<T> source,
            Condition<T> condition) {

        List<T> result = new ArrayList<>();

        for (T value : source) {
            if (condition.test(value)) {
                result.add(value);
            }
        }

        return result;
    }


    // Метод для 3.3
    public static <T> T reduce(
            List<T> source,
            T initialValue, // Нач. значение рез-а
            Combiner<T> combiner) {

        T result = initialValue;

        for (T element : source) {
            result = combiner.combine(result, element);
        }

        return result;
    }


    // Метод для 3.4
    public static <T, R> R collectValues(
            List<T> source,
            ResultFactory<R> factory,
            ResultWriter<R, T> writer) {

        R result = factory.create();

        for (T value : source) {
            writer.add(result, value);
        }

        return result;
    }
}

