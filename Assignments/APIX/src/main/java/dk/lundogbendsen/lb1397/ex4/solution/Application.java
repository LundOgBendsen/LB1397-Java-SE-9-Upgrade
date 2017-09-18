package dk.lundogbendsen.lb1397.ex4.solution;

import java.util.concurrent.SubmissionPublisher;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Earth orbit calculator starting");
        System.out.println("-------------------------------");

        // Setup publish/subscribe
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        ResultPrinter subscriber = new ResultPrinter();
        publisher.subscribe(subscriber);

        // Start orbit calculations
        EarthOrbitCalculator earthOrbitCalculator = new EarthOrbitCalculator(publisher);
        earthOrbitCalculator.run();

        System.out.println("-- END ------------------------");
    }

}
