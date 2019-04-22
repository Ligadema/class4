package by.yandex.sidvlada;

import java.util.Scanner;

public class Task2 {

    public void Houses() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter sides A and B");
        String SideA = scanner.nextLine();
        String SideB = scanner.nextLine();

        System.out.println("Please, enter sides C and D");
        String SideC = scanner.nextLine();
        String SideD = scanner.nextLine();

        System.out.println("Please, enter sides E and F");
        String SideE = scanner.nextLine();
        String SideF = scanner.nextLine();

        int a = Integer.parseInt(SideA);
        int b = Integer.parseInt(SideB);
        int c = Integer.parseInt(SideC);
        int d = Integer.parseInt(SideD);
        int e = Integer.parseInt(SideE);
        int f = Integer.parseInt(SideF);

        int s1 = a * b;
        int s2 = c * d;
        int s3 = e * f;

        if (a > e || b > e || c > e || d > e) {
            System.out.println("NO, this building is impossible");
        } else if (a > f || b > f || c > f || d > f) {
            System.out.println("NO, this building is impossible");
        } else if ((s1 + s2) >= s3) {
            System.out.println("NO, this building is impossible");
        } else {
            System.out.println("YES, NO, this building is possible");
        }
    }
}
