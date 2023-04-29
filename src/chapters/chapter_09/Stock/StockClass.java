package chapters.chapter_09.Stock;

public class StockClass {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;


        public StockClass(String symbol, String name, double previousClosingPrice, double currentPrice) {
            this.currentPrice = currentPrice;
            this.name = name;
            this.previousClosingPrice = previousClosingPrice;
            this.symbol = symbol;
        }

        public double getChangePercent(double previousClosingPrice, double currentPrice) {
            return ((previousClosingPrice - currentPrice) * 100) / previousClosingPrice;
        }
}
