package andersen;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        String regex = "^-?[0-9]+([\\s,;]+-?[0-9]+)*$";
        String regexSeparator = "[,;\\s]+";
        String input = null;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число, имя или массив:");
            input = scanner.nextLine();
            int number = Integer.parseInt(input);
            printGreetingIfGreaterThanSeven(number);
        } catch (NumberFormatException e) {
            handleNumberFormatException(input, regexSeparator, regex);
        }
    }

    public static void handleNumberFormatException(String input, String regexSeparator, String regex) {
        if (input.matches(".*" + regexSeparator + ".*")) {
            if (input.matches(regex)) {
                int[] array = Arrays.stream(input.split(regexSeparator))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                printElementsDivisibleByThree(array);
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число, имя или массив чисел.");
            }
        } else {
            printGreetingForRequiredName(input);
        }
    }

    public static void printGreetingIfGreaterThanSeven(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public static void printGreetingForRequiredName(String name) {
        String greeting = name.equals("Вячеслав") ? "Привет, " + name : "Нет такого имени";
        System.out.println(greeting);
    }

    public static void printElementsDivisibleByThree(int[] array) {
        System.out.println("Элементы массива, кратные 3:");
        Arrays.stream(array)
                .boxed()
                .filter(n -> n != 0 && n % 3 == 0)
                .forEach(System.out::println);
    }
}