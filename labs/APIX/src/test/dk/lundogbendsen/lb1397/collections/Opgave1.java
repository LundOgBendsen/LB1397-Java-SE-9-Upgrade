package dk.lundogbendsen.lb1397.collections;

import org.junit.Ignore;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.carrotsearch.sizeof.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Opgave1 {

    /** Create a list without using List.of(...) */
    private List<String> createListPreJava9() {
        return null; // TODO
    }

    /** Create a list using List.of(...) */
    private List<String> createListUsingJava9API() {
        return null; // TODO
    }

    /** Add an element to the list */
    private void addElement1(List<String> list, String value) {
        // TODO
    }

    /** Add an element to the list */
    private void addElement2(List<String> list, String value) {
        // TODO
    }

    private void changeElementNo3(List<String> list, String valueOfElementNo3) {
        // TODO
    }

    private void changeElementNo4(List<String> list, String valueOfElementNo4) {
        // TODO
    }

    @Test
    @Ignore
    public void a() {
        List<String> list = createListPreJava9();

        // Checks
        assertTrue(list instanceof ArrayList);
        assertEquals(8, list.size());
        assertEquals("Merkur", list.get(0));
        assertEquals("Venus", list.get(1));
        assertEquals("Jorden", list.get(2));
        assertEquals("Mars", list.get(3));
        assertEquals("Jupiter", list.get(4));
        assertEquals("Saturn", list.get(5));
        assertEquals("Uranus", list.get(6));
        assertEquals("Neptun", list.get(7));
    }

    @Test
    @Ignore
    public void b() {
        List<String> list = createListPreJava9();

        addElement1(list, "Planet X");
        assertEquals(9, list.size());
        assertEquals("Planet X", list.get(8));

        changeElementNo3(list, "Planet B");
        assertEquals(9, list.size());
        assertEquals("Planet B", list.get(3));
    }

    @Test
    @Ignore
    public void c() {
        List<String> list = createListUsingJava9API();

        // Checks
        assertEquals("java.util.ImmutableCollections$ListN", list.getClass().getName());

        assertEquals(9, list.size());
        assertEquals("Merkur", list.get(0));
        assertEquals("Venus", list.get(1));
        assertEquals("Jorden", list.get(2));
        assertEquals("Mars", list.get(3));
        assertEquals("Jupiter", list.get(4));
        assertEquals("Saturn", list.get(5));
        assertEquals("Uranus", list.get(6));
        assertEquals("Neptun", list.get(7));
    }

    @Test
    @Ignore
    public void d() {
        List<String> list = createListUsingJava9API();

        addElement2(list, "Planet X");
        assertEquals(9, list.size());
        assertEquals("Planet X", list.get(8));

        changeElementNo3(list, "Planet B");
        assertEquals(9, list.size());
        assertEquals("Planet B", list.get(3));
    }

    @Test
    @Ignore
    public void e() {
        List<String> listOldApi = createListPreJava9();
        List<String> listNewApi = createListUsingJava9API();

        long sizeOldApi = RamUsageEstimator.sizeOf(listOldApi);
        long sizeNewApi = RamUsageEstimator.sizeOf(listNewApi);

        System.out.printf("Memory usage old API: %d, new API: %d\n", sizeOldApi, sizeNewApi);

        assertTrue(sizeNewApi < sizeOldApi);
    }

    @Test
    @Ignore
    public void f() {
        //Integer[] ints = IntStream.rangeClosed(0, 1_000_000).boxed().toArray(Integer[]::new);
        List<String> listOldApi = createListPreJava9();      // Collections.unmodifiableList(Arrays.asList("A", "B", "C"));
        List<String> listNewApi = createListUsingJava9API(); // List.of("A", "B", "C");

        Duration duration1 = readRandomElements(listOldApi);
        Duration duration2 = readRandomElements(listNewApi);

        System.out.printf("Old API took %d msecs, new API took %d msecs\n", duration1.toMillis(), duration2.toMillis());
    }

    private static Duration readRandomElements(List<String> listOldApi) {
        final int n = listOldApi.size();
        Instant now = Instant.now();
        for (int i=0; i<100_000_000; i++) {
            listOldApi.get((int) (System.nanoTime() % n));
        }
        Instant then = Instant.now();
        return Duration.between(now, then);
    }

}
