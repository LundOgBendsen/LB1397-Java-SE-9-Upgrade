package dk.lundogbendsen.lb1397.ex3.solution;

import java.util.ResourceBundle;

public class LBLogger implements System.Logger {

    private final static Level THRESHOLD = Level.ALL;

    @Override
    public String getName() {
        return "dk.lundogbendsen.lb1397";
    }

    @Override
    public boolean isLoggable(Level level) {
        return true; //level.compareTo(THRESHOLD) >= 0;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        System.out.printf("LBLOG: %s %s\n", level, msg);
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        format = "LBLOG: %s " + format + "\n";
        System.out.printf(format, level, params);
    }
}
