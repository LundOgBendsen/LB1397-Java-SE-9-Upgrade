package dk.lundogbendsen.lb1397.collections;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Opgave1Løsning extends Opgave1 {

    @Override
    public void a() {
        System.out.println("--- Opgave 1a -----------------------------------------");

        List<String> immutableList = Collections.unmodifiableList(
                new ArrayList<String>(10) {{
                    add("Merkur");
                    add("Venus");
                    add("Jorden");
                    add("Mars");
                    add("Jupiter");
                    add("Saturn");
                    add("Uranus");
                    add("Neptun");
                }}
        );

        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void b() {
        System.out.println("--- Opgave 1b -----------------------------------------");

        List<String> list =
                new ArrayList<>(10) {{
                    add("Merkur");
                    add("Venus");
                    add("Jorden");
                    add("Mars");
                    add("Jupiter");
                    add("Saturn");
                    add("Uranus");
                    add("Neptun");
                }};

        List<String> immutableList = Collections.unmodifiableList(list);

        try {
            immutableList.add("Planet X");
        } catch (UnsupportedOperationException e) {
            System.out.println(immutableList.getClass().getSimpleName() + " does not support .add()");
        }

        try {
            immutableList.set(3, "Planet B");
        } catch (UnsupportedOperationException e) {
            System.out.println(immutableList.getClass().getSimpleName() + " does not support .set()");
        }

        System.out.println("immutableList.size() = " + immutableList.size());
        list.add("Planet X");
        System.out.println("immutableList.size() = " + immutableList.size());
        System.out.println("immutableList.get(8) = " + immutableList.get(8));

        System.out.println("immutableList.get(3) = " + immutableList.get(3));
        list.set(3, "Planet B");
        System.out.println("immutableList.get(3) = " + immutableList.get(3));

        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void c() {
        System.out.println("--- Opgave 1c -----------------------------------------");

        List.of(
                "Merkur",
                "Venus",
                "Jorden",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptun"
        );

        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void d() {
        System.out.println("--- Opgave 1d -----------------------------------------");

        // Ikke let - sandsynligvis umuligt - omend måske med reflection?

        System.out.println("-------------------------------------------------------");
    }

    public void e() {
        System.out.println("--- Opgave 1e -----------------------------------------");

        //Integer[] ints = IntStream.rangeClosed(0, 1_000_000).boxed().toArray(Integer[]::new);

        List<String> listOldApi = Collections.unmodifiableList(
                new ArrayList<String>(10) {{
                    add("Merkur");
                    add("Venus");
                    add("Jorden");
                    add("Mars");
                    add("Jupiter");
                    add("Saturn");
                    add("Uranus");
                    add("Neptun");
                }}
        );

        List<String> listNewApi = List.of(
                "Merkur",
                "Venus",
                "Jorden",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptun"
        );

        long sizeOldApi = RamUsageEstimator.sizeOf(listOldApi);
        long sizeNewApi = RamUsageEstimator.sizeOf(listNewApi);

        System.out.printf("Memory usage old API: %d bytes, new API: %d bytes\n", sizeOldApi, sizeNewApi);

        System.out.println("-------------------------------------------------------");
    }

    public void f() {
        System.out.println("--- Opgave 1f -----------------------------------------");

        List<String> listOldApi = Collections.unmodifiableList(
                new ArrayList<String>(10) {{
                    add("Merkur");
                    add("Venus");
                    add("Jorden");
                    add("Mars");
                    add("Jupiter");
                    add("Saturn");
                    add("Uranus");
                    add("Neptun");
                }}
        );

        List<String> listNewApi = List.of(
                "Merkur",
                "Venus",
                "Jorden",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptun"
        );

        Duration oldDuration = læsTilfældigeStederNGange(listOldApi, 10_000_000);
        Duration newDuration = læsTilfældigeStederNGange(listNewApi, 10_000_000);

        System.out.printf("Time old: %d, time new: %d\n", oldDuration.toMillis(), newDuration.toMillis());

        System.out.println("-------------------------------------------------------");
    }

    private Duration læsTilfældigeStederNGange(final List<String> list, final int n) {
        final int size = list.size();
        Instant now = Instant.now();
        for (int i = 0; i < n; i++) {
            list.get((int) (System.nanoTime()%size));
        }
        Instant then = Instant.now();
        return Duration.between(now, then);
    }

    public void g() {
        System.out.println("--- Opgave 1g -----------------------------------------");
        // TODO Instructor!
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        Opgave1 opgave1 = new Opgave1Løsning();

        opgave1.a();
        opgave1.b();
        opgave1.c();
        opgave1.d();
        opgave1.e();
        opgave1.f();
        opgave1.g();
    }

}
