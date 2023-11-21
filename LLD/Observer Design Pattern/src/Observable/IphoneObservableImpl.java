package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationAlertObserver>observerList=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(stockCount);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int newStockAdded) {
        if(stockCount==0){
            notifyObserver();
        }
        stockCount=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
     
}
