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

package Levels._1;

import Levels.CheckInput;
import Levels.MainCode;

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
        String str = scan.next();
        if (CheckInput.isInteger(str)) {
            System.out.printf("Первая цифра числа %s\n%d", str, Integer.parseInt(str) / (int) (Math.pow(10, str.length() - 1)));
        } else {
            CheckInput.incorrectInput();
        }
        MainCode.choose_level();
    }

    public static void Task2() {
        System.out.println("Введите число:");
        String str = scan.next();
        if (CheckInput.isInteger(str)) {
            System.out.printf("Последняя цифра числа %s\n%d", str, Integer.parseInt(str) % 10);
        } else {
            CheckInput.incorrectInput();
        }
        MainCode.choose_level();
    }

    public static void Task3() {
        System.out.println("Введите число:");
        String str = scan.next();
        if (CheckInput.isInteger(str)) {
            int numberFirst, numberLast, digitCount;
            digitCount = str.length();
            int number = Integer.parseInt(str);
            if (digitCount == 1) {
                System.out.println("Введенное число содержит только одну цифру");
            } else {
                numberFirst = number / (int) (Math.pow(10, digitCount - 1));
                numberLast = number % 10;
                System.out.printf("Сумма первой и последней цифры числа %d\n%d", number, numberFirst + numberLast);
            }
        } else {
            CheckInput.incorrectInput();
        }
        MainCode.choose_level();
    }

    public static void Task4() {
        System.out.println("Введите число:");
        String str = scan.next();
        if (CheckInput.isInteger(str)) {
            System.out.printf("Количество цифр в числе %d\n%d", Integer.parseInt(str), str.length());
        }
        MainCode.choose_level();
    }

    public static void Task5() {
        System.out.println("Введите первое число:");
        String str1 = CheckInput.input();
        if (!CheckInput.isInteger(str1)) {
            CheckInput.incorrectInput();
        }

        //int number2 = scan.nextInt();
//
        //if (str1.charAt(0) == str2.charAt(0)) {
        //    System.out.println("Первые цифры чисел " + number1 + " и " + number2 + " совпадают");
        //} else {
        //    System.out.println("Первые цифры чисел " + number1 + " и " + number2 + " не совпадают");
        //}
    }


}
