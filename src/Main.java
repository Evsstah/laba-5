import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1.1
        System.out.println("\nЗадача 1.1:");
        // Создание объектов Fraction
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(-1, 4);

        // Вывод строкового представления
        System.out.println("Дробь 1: " + fraction1);
        System.out.println("Дробь 2: " + fraction2);

        // Сравнение объектов
        System.out.println("Дробь 1 равна Дроби 2? : " + fraction1.equals(fraction2));

        // Вывод вещественного значения
        System.out.println("Вещественное значение Дроби 1: " + fraction1.getValue());
        System.out.println("Вещественное значение Дроби 2: " + fraction2.getValue());

        // Изменение числителя и знаменателя
        fraction1.setNumerator(3);
        fraction1.setDenominator(5);

        // Вывод измененного строкового представления
        System.out.println("Измененная Дробь 1: " + fraction1);

        // Вывод измененного вещественного значения
        System.out.println("Измененное вещественное значение Дроби 1: " + fraction1.getValue());


        // Задание 2.1
        System.out.println("\nЗадача 2.1:");
        // Создаем объект класса Cat
        Cat cat = new Cat("Лютик");

        MeowCounter meowCounter = new MeowCounter();

        // Передаю кота в метод meowsCare и указываю количество мяуканий
        meowCounter.meowsCare(cat, 5);

        System.out.println(meowCounter.toString());

        System.out.println(cat.toString());


        // Задание 3.7
        System.out.println("\nЗадача 3.7:");

        List1 list1 = new List1();
        List1 list2 = new List1();

        System.out.println("Введите элементы для первого списка (введите \".\", чтобы завершить):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(".")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                list1.addElement(value);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите действительное целое число.");
            }
        }

        System.out.println("Введите элементы для второго списка (введите \".\", чтобы завершить):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(".")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                list2.addElement(value);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите действительное целое число.");
            }
        }

        List<Integer> commonElements = findCommonElements(list1.getList(), list2.getList());

        System.out.println("Общие элементы: " + commonElements);


        // Задание 4.7
        System.out.println("\nЗадача 4.7:");


        // Задание 5.7
        System.out.println("\nЗадача 5.7:");
        String inputText = "Бу! Испугался? Не бойся, я друг, я тебя не обижу. Иди сюда, иди ко мне, сядь рядом со мной.";

        Text text1 = new Text(inputText);
        int count = text1.countDistinct();

        System.out.println("Текст: " + inputText);
        System.out.println("Количество различных букв в тексте: " + count);


        // Задание 6.2
        System.out.println("\nЗадача 6.2:");
        List<Integer> list = Arrays.asList(1, 2, 3);
        QueueList queueBuilder = new QueueList(list);
        Queue<Integer> queue = queueBuilder.buildQueue();

        System.out.println(queueBuilder.toString());
        System.out.println("Очередь: " + queue);


        // Задание 7.1
        System.out.println("\nЗадача 7.1:");


        // Задание 7.2
        System.out.println("\nЗадача 7.2:");

    }

    // метод для задания 3.7
    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> elements = new ArrayList<>();
        for (Integer element1 : list1) {
            if (list2.contains(element1) && !elements.contains(element1)) {
                elements.add(element1);
            }
        }
        return elements;
    }
}