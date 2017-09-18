package dk.lundogbendsen.lb1397.ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.HOURS;

public class EarthOrbitCalculator {

    public EarthOrbitCalculator(/* TODO SubmissionPublisher<String> publisher */) {
        // TODO
    }

    public void run() throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i=0; i<3600; i++) {
            final int calculationStep = i;
            // TODO executor.submit(
            //    () -> advancedCalculationOfAngleToSun(i)
            // );
        }

        executor.shutdown();
        executor.awaitTermination(1L, HOURS);
    }

    private static String advancedCalculationOfAngleToSun(int step) {
        return String.format("Step %d: Angle to sun is %4.1f", step, Math.random()*360);
    }

}
