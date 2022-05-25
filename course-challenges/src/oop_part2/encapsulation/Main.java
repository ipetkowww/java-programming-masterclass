package oop_part2.encapsulation;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.printPages(2));
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getPagesPrinted());
    }

}
