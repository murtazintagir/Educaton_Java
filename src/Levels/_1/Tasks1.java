/**
 * Уровень 1.1
 * Задача №1
 * Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
 * Задача №2
 * Дана строка. Выведите в консоль длину этой строки.
 * Задача №3.
 * Дана строка. Выведите в консоль последний символ строки.
 * Задача №4.
 * Дано число. Проверьте, четное оно или нет.
 * Задача №5.
 * Даны два слова. Проверьте, что первые буквы этих слов совпадают.
 * Задача №6.
 * Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите
 * предпоследнюю букву.
 */
package Levels._1;

import Levels.CheckInput;
import Levels.MainCode;

import java.util.Scanner;

public class Tasks1 {
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
            case 6:
                Task6();
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    // Задача №1.1
    public static void Task1() {
        System.out.println("Введите число:");
        String str = CheckInput.input();
        if (CheckInput.isInteger(str)) {
            if (CheckInput.number(str) >= 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            CheckInput.incorrectInput();
        }
        MainCode.choose_level();
    }

    // Задача №1.2
    public static void Task2() {
        System.out.println("Введите строку:");
        String str = CheckInput.input();
        System.out.println("Длина строки " + str.length());
        MainCode.choose_level();
    }

    // Задача №1.3
    public static void Task3() {
        System.out.println("Введите строку:");
        String str = CheckInput.input();
        System.out.println("Последний символ строки " + str.charAt(str.length() - 1));
        MainCode.choose_level();
    }

    // Задача №1.4
    public static void Task4() {
        System.out.println("Введите число:");
        String str = CheckInput.input();
        if (CheckInput.isInteger(str)) {
            if (CheckInput.number(str) % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        } else {
            CheckInput.incorrectInput();
        }
        MainCode.choose_level();
    }

    // Задача №1.5
    public static void Task5() {
        System.out.println("Введите первое слово:");
        String str1 = CheckInput.input();
        System.out.println("Введите второе слово:");
        String str2 = CheckInput.input();
        if (str1.charAt(0) == str2.charAt(0)) {
            System.out.println("Первые буквы слов совпадают");
        } else {
            System.out.println("Первые буквы слов не совпадают");
        }
        MainCode.choose_level();
    }

    // Задача №1.6
    public static void Task6() {
        System.out.println("Введите слово:");
        String str = CheckInput.input();
        char ch = 'ь';
        if (str.charAt(str.length() - 1) != ch) {
            System.out.println("Последняя буква слова " + str.charAt(str.length() - 1));
        } else {
            System.out.println("Последняя буква слова мягкий знак");
            System.out.println("Предпоследняя буква слова " + str.charAt(str.length() - 2));
        }
        MainCode.choose_level();
    }
}
