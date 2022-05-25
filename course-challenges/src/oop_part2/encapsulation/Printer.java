package oop_part2.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int toner = -1;
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int currentToner = tonerLevel + tonerAmount;
            if (currentToner <= 100) {
                tonerLevel += tonerAmount;
                toner = tonerLevel;
            }
        }
        return toner;
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
