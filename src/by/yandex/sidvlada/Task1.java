package by.yandex.sidvlada;

import java.util.Scanner;

public class Task1 {

    public void Date() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter day, month and year.");
        String d = scanner.nextLine();
        String m = scanner.nextLine();
        String y = scanner.nextLine();

        int day = 0;
        int month = 0;
        int year = 0;

        boolean date = true;

        day = Integer.parseInt(d);
        month = Integer.parseInt(m);
        year = Integer.parseInt(y);

        if (day == 31 && month % 2 == 0 && month != 12) {
            date = false;
            System.out.println("Sorry, the date is incorrect.");
        } else if (day > 29 && month == 2) {
            date = false;
            System.out.println("Sorry, the date is incorrect.");
        } else if (day <= 31 && day > 0 && month <= 12 && month > 0 && year > 0) {
            date = true;
            System.out.println("Your date: " + day + "/" + month + "/" + year);
        } else {
            date = false;
            System.out.println("Sorry, the date is incorrect.");
        }

        int nextday = day;
        int nextmonth = month;
        int nextyear = year;

        while (date == true) {
            if (day == 31 && month == 12) {
                nextday = 1;
                nextmonth = 1;
                nextyear++;
                System.out.println("Next date: " + nextday + "/" + nextmonth + "/" + nextyear);
                break;
            } else if (day == 31) {
                nextday = 1;
                nextmonth++;
                System.out.println("Next date: " + nextday + "/" + nextmonth + "/" + nextyear);
                break;
            } else if (day == 30 && month % 2 == 0) {
                nextday = 1;
                nextmonth++;
                System.out.println("Next date: " + nextday + "/" + nextmonth + "/" + nextyear);
                break;
            } else if (day == 29 && month == 2) {
                nextday = 1;
                nextmonth++;
                System.out.println("Next date: " + nextday + "/" + nextmonth + "/" + nextyear);
                break;
            } else {
                nextday++;
                System.out.println("Next date: " + nextday + "/" + nextmonth + "/" + nextyear);
                break;
            }
        }
    }
}
