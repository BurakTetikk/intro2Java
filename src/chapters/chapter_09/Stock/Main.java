package chapters.chapter_09.Stock;

public class Main {
    public static void main(String[] args) {
        StockClass stockClass = new StockClass("ORCL", "Oracle Corporation", 34.5, 35.5);
        System.out.printf("%.3f", stockClass.getChangePercent(stockClass.previousClosingPrice, stockClass.currentPrice));
    }
}
