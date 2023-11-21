package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObserver();
    public void setStocksCount(int newStockAdded);
    public int getStockCount();
}
