package Observer;

import Observable.StocksObservable;

public class MobileObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable stocksObservable;
    
    public MobileObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName=userName;
        this.stocksObservable=stocksObservable;
    }


    @Override
    public void update() {
        System.out.println("Mobile observer "+userName+" received an alert!");
    }
     
}
