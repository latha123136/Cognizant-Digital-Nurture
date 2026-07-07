public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Rahul");

        Observer web = new WebApp("Priya");

        stockMarket.registerObserver(mobile);

        stockMarket.registerObserver(web);

        stockMarket.setStockPrice("TCS", 3500);

        stockMarket.setStockPrice("Infosys", 1650);

    }

}