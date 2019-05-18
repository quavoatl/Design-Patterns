package TestObserverPattern;

public class ObserverPatternMain {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Observers observer1 = new Observers(stock);
        stock.setAdidasPrice(152.42);
        stock.setNikePrice(521.41);
        stock.setPumaPrice(631.83);

        System.out.println("Observer 2");

        Observers observer2 = new Observers(stock);
        stock.setAdidasPrice(233.42);
        stock.setNikePrice(522111.421);
        stock.setPumaPrice(651231.8423);

        stock.unRegister(observer1);
    }


}
