package TestObserverPattern;

public class Observers implements Observer {
    private double adidasPrice;
    private double nikePrice;
    private double pumaPrice;

    public static int observerTrackingId = 1;
    public int observerId = 0;

    private Subject stock;

    public Observers(Subject stock) {
        this.stock = new Stock();
        this.observerId = observerTrackingId++;

        System.out.println("New observer " + observerId);

        stock.register(this);


    }


    @Override
    public void update(double adidasPrice, double nikePrice, double pumaPrice) {
        this.adidasPrice = adidasPrice;
        this.nikePrice = nikePrice;
        this.pumaPrice = pumaPrice;

        printStockPrices();

    }

    public void printStockPrices() {
        System.out.println(observerId + "\nAdidas price:" + adidasPrice +
                "\nNike price: " + nikePrice +
                "\nPuma price: " + pumaPrice + "\n");
    }
}
