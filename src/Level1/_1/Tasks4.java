/**
 * Уровень 1.4
 * Задача №1.
 * Выведите в консоль все четные числа из промежутка от 1 до 100.
 * Задача №2.
 * Дана некоторая строка. Переберите и выведите в консоль по очереди все символы с конца строки.
 * Задача №3.
 * Дано целое число, содержащее номер минуты от 0 до 60. Определите, в какую четверть часа попадает это значение.
 */

package Level1._1;

import java.util.Scanner;

public class Tasks4 {

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
