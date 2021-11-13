package academy.learnprogramming;

public class Printer {

    private String name;
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(String name, int tonerLevel, boolean isDuplex) {
        this.name = name;

        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
