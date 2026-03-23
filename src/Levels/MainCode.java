package Levels;

import Levels._1.*;

import java.util.Scanner;

public class MainCode {

    public static void choose_level() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер уровня");
        boolean go = true;
        while (go) {
            int level = scan.nextInt();
            switch (level) {
                case 0:
                    System.out.println("Goodbye");
                    go = false;
                    break;
                case 1:
                    Tasks1.source();
                    break;
                case 2:
                    Tasks2.source();
                    break;
                case 3:
                    Tasks3.source();
                    break;
                case 4:
                    Tasks4.source();
                    break;
                case 5:
                    Tasks5.source();
                    break;
            }
        }
    }
}
