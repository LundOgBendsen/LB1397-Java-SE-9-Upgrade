package dk.lundogbendsen.lb1397.ex3.opgave;

import java.util.ResourceBundle;

public class LBLogger implements System.Logger {

    @Override
    public String getName() {
        return null;  // TODO
    }

    @Override
    public boolean isLoggable(Level level) {
        return false; // TODO
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        //TODO
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        //TODO
    }
}
