package Observer;

import Observable.StocksObservable;

public class EmailObserverImpl implements NotificationAlertObserver{
    String email;
    StocksObservable stocksObservable;

    public EmailObserverImpl(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println(email +": Email Alert: New notification received");
    }
    
}
