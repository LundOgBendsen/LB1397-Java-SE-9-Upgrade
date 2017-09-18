package dk.lundogbendsen.lb1397.ex3.solution;

import static java.lang.System.Logger.Level.INFO;

/**
 * Denne klasse rummer hovedprogrammet, som skal startes fra kommandolinien eller IDE
 */
public class Application {

    private static final System.Logger LOGGER = System.getLogger("java.lang.Thread");

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
