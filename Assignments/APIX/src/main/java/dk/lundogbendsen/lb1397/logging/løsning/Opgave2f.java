package dk.lundogbendsen.lb1397.logging.løsning;

import static java.lang.System.Logger.Level.INFO;

public class Opgave2f {

    private static final System.Logger LOGGER = System.getLogger("dk.lundogbendsen.lb1397");

    public void f() {
        LOGGER.log(INFO, "f() entered.");
        System.out.println("--- Opgave 2f -----------------------------------------");
        System.out.println("-------------------------------------------------------");
        LOGGER.log(INFO, "f() exiting.");
    }

    public static void main(String[] args) {
        Opgave2f opgave2 = new Opgave2f();

        opgave2.f();
    }
}
