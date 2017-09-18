package dk.lundogbendsen.lb1397.ex4.solution;

import java.util.concurrent.Flow;

public class ResultPrinter implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(String result) {
        System.out.println("### " + result);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Calculations are complete.");
    }

}
