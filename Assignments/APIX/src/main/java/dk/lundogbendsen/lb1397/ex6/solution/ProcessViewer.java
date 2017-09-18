package dk.lundogbendsen.lb1397.ex6.solution;

import java.util.Optional;

public class ProcessViewer {

    public static void main(String[] args) {
        System.out.println("Process info");
        System.out.println("--------------------------");

        printInfoAboutProcess(ProcessHandle.current());
        ProcessHandle.allProcesses().forEach(p -> printInfoAboutProcess(p));
    }

    private static void printInfoAboutProcess(ProcessHandle current) {
        System.out.printf("pid %d ", current.pid());
        System.out.printf("(");
        System.out.printf("user: %s, ", current.info().user().orElse("?"));
        System.out.printf("accumulated cpu: %s, ", current.info().totalCpuDuration().orElse(null));

        Optional<ProcessHandle> parent = current.parent();
        if (parent.isPresent()) {
            System.out.printf("parent pid: %d", parent.get().pid());
        }

        System.out.printf(")\n");
    }

}
