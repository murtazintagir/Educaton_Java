/**
 * Уровень 1.5
 * Задача №1
 * Выведите в консоль все числа кратные трем в промежутке от 1 до 100.
 * Задача №2.
 * Даны два целых числа. Проверьте, что первое число без остатка делится на второе.
 * Задача №3.
 * Даны три символа. Слейте эти символы в строку.
 *
 */

package Level1._1;

import java.util.Scanner;

public class Tasks5 {

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
            default:
                System.out.println("Неверный ввод");
        }
    }

    public static void Task1() {
        for (int i = 0; i < 101; i += 2) {
            System.out.println(i);
        }
    }

    public static void Task2() {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }

    public static void Task3() {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }
}
