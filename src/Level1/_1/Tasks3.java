/**
 * Уровень 1.3
 * Задача №1
 * Выведите в консоль все целые числа от 1 до 100.
 * Задача №2.
 * Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.
 * Задача №3.
 * Даны два целых числа. Найдите остаток от деления первого числа на второе.
 * Задача №4.
 * Дано целое число, содержащее номер месяца от 1 до 12. Определите, в какую пору года попадает этот месяц.
 */

package Level1._1;

import java.util.Scanner;

public class Tasks3 {

    public static Scanner scan = new Scanner(System.in);

    public static void source() {
        System.out.println("Введите номер задачи:");
        int task = scan.nextInt();
        switch (task) {
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;
            case 3:
                Task3();
                break;
            case 4:
                Task4();
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    public static void Task1() {
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }

    public static void Task2() {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.length() > 1) {
            System.out.println("Предпоследний символ строки " + text + " " + text.charAt(text.length() - 2));
        } else {
            System.out.println("Строка " + text + " состоит из одного символа");
        }
    }

    public static void Task3() {
        System.out.println("Введите первое число:");
        int number1 = scan.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scan.nextInt();
        System.out.println("Остаток от деления числа " + number1 + " на число " + number2 +
                " равен " + number1 % number2);
    }

    public static void Task4() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }

    }
}
