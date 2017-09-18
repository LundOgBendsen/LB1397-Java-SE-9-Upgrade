package dk.lundogbendsen.lb1397.ex3.exercise;

import java.lang.System.Logger;

import static java.lang.System.Logger.Level.INFO;

public class Application {

    private static final Logger LOGGER = System.getLogger("LBLoggerLøsning");

    public void run() {
        LOGGER.log(INFO, "run() entered.");
        System.out.println("--- Opgave 2f -----------------------------------------");
        System.out.println("-------------------------------------------------------");
        LOGGER.log(INFO, "run() exiting.");
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

}
