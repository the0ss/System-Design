import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailObserverImpl;
import Observer.MobileObserverImpl;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StocksObservable iphObservable=new IphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailObserverImpl("xyz@gmail.com", iphObservable);
        NotificationAlertObserver observer2=new EmailObserverImpl("abc@gmail.com", iphObservable);
        NotificationAlertObserver observer3=new MobileObserverImpl("theos", iphObservable);

        iphObservable.add(observer3);
        iphObservable.add(observer2);
        iphObservable.add(observer1);

        iphObservable.setStocksCount(10);
        iphObservable.setStocksCount(0);
        iphObservable.setStocksCount(10);
    }
}
