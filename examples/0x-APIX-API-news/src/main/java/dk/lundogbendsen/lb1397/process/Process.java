package dk.lundogbendsen.lb1397.process;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Paths;

public class Process {

    /*
     * Getting the PID the pre-Java 9 way
     */
    public long getProcessOwnID_1() {
        String pName = ManagementFactory.getRuntimeMXBean().getName();
        return Long.parseLong(pName.split("@")[0]);
    }

    /*
     * Getting the PID using the updated Java 9 SE API
     */
    public long getProcessOwnID_2() {
        return ProcessHandle.current().pid();
    }


    /**
     * Listing a directory
     * @param args
     * @throws IOException
     */

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ProcessBuilder ls = new ProcessBuilder()
                .command("ls -l")
                .directory(Paths.get("/tmp").toFile());

        java.lang.Process process = ls.start();
        System.out.println("Process id " + process.pid() + " started by user " + process.info().user() );//+ " on " + process.info().startInstant().get());

        java.lang.Process finishedProcess = process.onExit().join();
        System.out.println("Process id " + finishedProcess.pid()); // + " consumed " + finishedProcess.info().totalCpuDuration().get());

    }

}
