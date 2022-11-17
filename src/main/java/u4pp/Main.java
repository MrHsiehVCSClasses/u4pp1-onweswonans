package u4pp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //LeapYear my = new LeapYear();
        //my.isLeapYear(2020);
        //MyMath mi = new MyMath();
        Scanner poop = new Scanner(System.in);
        InputHelper handy = new InputHelper(poop);

        handy.getYesNoInput("is your penis small?");
        handy.getIntegerInput("hi", 0, 10);
    }
}