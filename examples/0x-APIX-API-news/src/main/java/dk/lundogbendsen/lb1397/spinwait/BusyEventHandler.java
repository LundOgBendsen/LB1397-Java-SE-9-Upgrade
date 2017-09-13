package dk.lundogbendsen.lb1397.spinwait;

public class BusyEventHandler {

    volatile boolean eventNotificationNotReceived;

    void waitForEventAndHandleIt() {
        while (eventNotificationNotReceived) {
        }
        readAndProcessEvent();
    }

    void readAndProcessEvent() {
        // Read event from some source and process it
    }

}
