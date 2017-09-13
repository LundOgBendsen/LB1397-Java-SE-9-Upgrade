package dk.lundogbendsen.lb1397.spinwait;

public class HintingEventHandler {

    volatile boolean eventNotificationNotReceived;

    void waitForEventAndHandleIt() {
        while (eventNotificationNotReceived) {
            java.lang.Thread.onSpinWait();
        }
        readAndProcessEvent();
    }

    void readAndProcessEvent() {
        // Read event from some source and process it
    }

}
