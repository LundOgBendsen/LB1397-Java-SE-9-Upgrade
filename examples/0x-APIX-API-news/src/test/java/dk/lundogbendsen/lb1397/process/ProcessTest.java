package dk.lundogbendsen.lb1397.process;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessTest {

    Process sut;

    @Before
    public void before() {
        sut = new Process();
    }

    @Test
    public void getProcessOwnID_1() throws Exception {
        System.out.printf("1: %S\n", sut.getProcessOwnID_1());
    }

    @Test
    public void getProcessOwnID_2() throws Exception {
        System.out.printf("2: %S\n", sut.getProcessOwnID_2());
    }

    @Test
    public void listAllProcessIds() throws Exception {
        ProcessHandle.allProcesses().forEach(System.out::println);
    }

    @Test
    public void listAllProcesses() throws Exception {
        ProcessHandle.allProcesses().forEach(handle -> System.out.println(formatProcess(handle)));
    }

    public static String formatProcess(ProcessHandle handle) {
        return "pid:" + handle.pid() + "\talive:" + handle.isAlive() + "\tcpu:" + handle.info().totalCpuDuration() + "\tcmd:" + handle.info().command() + "\tstart:" + handle.info().startInstant() + "\tuser:" + handle.info().user();
    }

    /** Example of how to use ProcessBuilder (Java 5) */
    @Test
    public void listFolder() throws Exception {
        ProcessBuilder ls = new ProcessBuilder()
            .command("ls", "-l")
            .directory(Paths.get("/").toFile());

        InputStream output = ls.start().getInputStream();

        String reader = new BufferedReader(new InputStreamReader(output))
                .lines().collect(Collectors.joining("\n"));

        System.out.println("Process output:\n" + reader);
    }

    /** Example of how to use ProcessBuilder pipelies (Java 9) */
    @Test
    public void runLsAndGrepInPipeline() throws Exception {
        ProcessBuilder ls = new ProcessBuilder()
                .command("ls", "-l")
                .directory(Paths.get("/").toFile());

        ProcessBuilder grep = new ProcessBuilder()
                .command("grep", "admin");

        List<java.lang.Process> processes = ProcessBuilder.startPipeline(List.of(ls, grep));

        String reader = new BufferedReader(new InputStreamReader(processes.get(1).getInputStream()))
                .lines().collect(Collectors.joining("\n"));

        System.out.println("Process output:\n" + reader);
    }

}