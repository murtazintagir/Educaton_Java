/**
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
package Level1._1;

import java.util.Scanner;

public class Task1 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер задачи:");
        int task = scan.nextInt();
        switch (task) {
            case 1:
                Task1_1();
                break;
            case 2:
                Task1_2();
                break;
            case 3:
                Task1_3();
                break;
            case 4:
                Task1_4();
                break;
            case 5:
                Task1_5();
                break;
            case 6:
                Task1_6();
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    // Задача №1.1
    public static void Task1_1() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Задача №1.2
    public static void Task1_2() {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Длина строки " + text.length());
    }

    // Задача №1.3
    public static void Task1_3() {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Последний символ строки " + text.charAt(text.length() - 1));
    }

    // Задача №1.4
    public static void Task1_4() {
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    // Задача №1.5
    public static void Task1_5() {
        System.out.println("Введите первое слово:");
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        System.out.println("Введите второе слово:");
        String word2 = scan.nextLine();
        if (word1.charAt(0) == word2.charAt(0)) {
            System.out.println("Первые буквы слов совпадают");
        } else {
            System.out.println("Первые буквы слов не совпадают");
        }
    }

    // Задача №1.6
    public static void Task1_6() {
        System.out.println("Введите слово:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        if (word.charAt(word.length() - 1) != 'ь') {
            System.out.println("Последняя буква слова " + word.charAt(word.length() - 1));
        } else {
            System.out.println("Последняя буква слова мягкий знак");
            System.out.println("Предпоследняя буква слова " + word.charAt(word.length() - 2));
        }
    }
}
