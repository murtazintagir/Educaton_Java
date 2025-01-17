/**
 * Уровень 1.2
 * Задача №1.
 * Дано целое число. Выведите в консоль первую цифру этого числа.
 * Задача №2.
 * Дано целое число. Выведите в консоль последнюю цифру этого числа.
 * Задача №3.
 * Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
 * Задача №4.
 * Дано целое число. Выведите количество цифр в этом числе.
 * Задача №5.
 * Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
 */

package Level1._1;

import java.util.Scanner;

public class Tasks2 {
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
            case 5:
                Task5();
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    public static void Task1() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        String str = String.valueOf(number);
        System.out.println("Первая цифра числа " + number + " " + str.charAt(0));
    }

    public static void Task2() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        String str = String.valueOf(number);
        System.out.println("Последняя цифра числа " + number + " " + str.charAt(str.length() - 1));
    }

    public static void Task3() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        String str = String.valueOf(number);
        int numberFirst = str.charAt(0);
        int numberLast = str.charAt(str.length() - 1);
        System.out.println("Сумма первой и последней цифры числа " + number + " " + numberFirst + numberLast);
    }

    public static void Task4() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        String str = String.valueOf(number);
        System.out.println("Количество цифр в числе " + number + " равно " + str.length());
    }

    public static void Task5() {
        System.out.println("Введите первое число:");
        int number1 = scan.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scan.nextInt();
        String str1 = String.valueOf(number1);
        String str2 = String.valueOf(number2);
        if (str1.charAt(0) == str2.charAt(0)) {
            System.out.println("Первые цифры чисел " + number1 + " и " + number2 + " совпадают");
        } else {
            System.out.println("Первые цифры чисел " + number1 + " и " + number2 + " не совпадают");
        }
    }
}
