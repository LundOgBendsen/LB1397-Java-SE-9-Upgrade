package dk.lundogbendsen.lb1397.logging.opgave;

import java.lang.System.Logger;

import static java.lang.System.Logger.Level.INFO;

public class Opgave2f {

    private static final Logger LOGGER = System.getLogger("LBLoggerLøsning");

    public void f() {
        LOGGER.log(INFO, "f() entered.");
        System.out.println("--- Opgave 2f -----------------------------------------");
        System.out.println("-------------------------------------------------------");
        LOGGER.log(INFO, "f() exiting.");
    }

    public static void main(String[] args) {
        dk.lundogbendsen.lb1397.logging.løsning.Opgave2f opgave2 = new dk.lundogbendsen.lb1397.logging.løsning.Opgave2f();

        opgave2.f();
    }

}
