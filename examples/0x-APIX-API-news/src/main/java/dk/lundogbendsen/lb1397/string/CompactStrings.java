package dk.lundogbendsen.lb1397.string;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CompactStrings {

    // Try running this without and with -XX:-CompactStrings

    public static void main(String[] args) {
        Instant startTime = Instant.now();

        List<String> strings = IntStream.rangeClosed(1, 10_000_000)
                .boxed()
                .map(i -> String.valueOf(i))
                .collect(toList());

        Duration duration = Duration.between(startTime, Instant.now());
        System.out.println("Created " + strings.size() + " strings in " + duration.toMillis() + " msecs.");

        startTime = Instant.now();

        String concat = strings.stream()
                .limit(100_000)
                .reduce("", (l, r) -> l.toString() + r.toString());

        duration = Duration.between(startTime, Instant.now());

        System.out.println("Concatenated into string of length " + concat.length() + " in " + duration.toMillis() + " ms.");

        System.out.println("Current heap size is " + (Runtime.getRuntime().totalMemory() >> 20)  + " MB");
    }

}
