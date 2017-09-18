package dk.lundogbendsen.lb1397.ex7.solution;

public class BusyWaiter {

    public static void main(String[] args) {
        //busyWaitWithoutSpinWaitHints();
        busyWaitWithSpinWaitHints();
    }

    private static void busyWaitWithoutSpinWaitHints() {
        System.out.println("Starting busy wait without CPU spin-wait hints");

        while(true) {
        }
    }

    private static void busyWaitWithSpinWaitHints() {
        System.out.println("Starting busy wait with CPU spin-wait hints");

        while(true) {
            Thread.onSpinWait();
        }
    }

}
