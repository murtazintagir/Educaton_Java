import Level1._1.Tasks1;
import Level1._1.Tasks2;
import Level1._1.Tasks3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер уровня");
        int level = scan.nextInt();
        switch (level) {
            case 1:
                Tasks1.source();
                break;
            case 2:
                Tasks2.source();
                break;
            case 3:
                Tasks3.source();
                break;
        }
    }
}