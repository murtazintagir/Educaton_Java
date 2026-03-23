package Levels;

import java.util.Scanner;

public class CheckInput {
    // Проверка на целое число
    public static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int number(String str) {
        return Integer.parseInt(str);
    }

    public static void incorrectInput() {
        System.out.println("Введенные символы не являются числом");
    }
}
