package by.yandex.sidvlada;

import java.util.Scanner;

public class Task3 {

    public void Factorial() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number");
        String number = scanner.nextLine();

        int n = Integer.parseInt(number);

        int f = 1;
        int i = 1;
        int x = n + 1;

        while (i < x) {
            for (i = 1; i <= n; i++) {
                f *= i;
            }
                break;
            }
            System.out.println("Factorial: " + f);
        }
    }
