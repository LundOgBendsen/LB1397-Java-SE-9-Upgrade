package dk.lundogbendsen.lb1397.flow;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlowDemo {

    public static void main(String[] args)
    {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

        Subscriber<Integer> subscriber = new Subscriber<>();
        publisher.subscribe(subscriber);

        System.out.println("Thread " + Thread.currentThread().getName() + " publishing...");
        List<Integer> items = IntStream.range(1, 101).boxed().collect(Collectors.toList());

        items.stream().forEach(i -> publisher.submit(i));
        publisher.close();

        try {
            synchronized("X") {
                "X".wait();
            }
        }
        catch (InterruptedException ie) {
        }
    }
}

class Subscriber<T> implements Flow.Subscriber<T> {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        System.out.println("Thread " + Thread.currentThread().getName() + " received: " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
        synchronized("X") {
            "X".notifyAll();
        }
    }

    @Override
    public void onComplete()  {
        System.out.println("Completed.");
        synchronized("X") {
            "X".notifyAll();
        }
    }
}
