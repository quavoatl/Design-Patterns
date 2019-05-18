package TestObserverPattern;

import java.util.ArrayList;

public class Stock implements Subject {
    private ArrayList<Observer> observers;
    private double adidasPrice;
    private double nikePrice;
    private double pumaPrice;

    public Stock() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(adidasPrice,nikePrice,pumaPrice);
        }
    }

    public void setAdidasPrice(double adidasPrice) {
        this.adidasPrice = adidasPrice;
        notifyObserver();
    }

    public void setNikePrice(double nikePrice) {
        this.nikePrice = nikePrice;
        notifyObserver();
    }

    public void setPumaPrice(double pumaPrice) {
        this.pumaPrice = pumaPrice;
        notifyObserver();
    }
}
