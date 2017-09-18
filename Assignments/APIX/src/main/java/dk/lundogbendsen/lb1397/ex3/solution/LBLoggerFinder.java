package dk.lundogbendsen.lb1397.ex3.solution;

public class LBLoggerFinder extends System.LoggerFinder {

    @Override
    public System.Logger getLogger(String name, Module module) {
        System.out.printf("-- getLogger(): name=%s, module=%s\n", name, module.getName());
        return new LBLogger();
    }

}
