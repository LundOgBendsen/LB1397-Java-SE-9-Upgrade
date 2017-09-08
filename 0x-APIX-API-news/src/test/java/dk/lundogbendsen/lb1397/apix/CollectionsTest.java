package dk.lundogbendsen.lb1397.apix;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

@RunWith(org.junit.runners.JUnit4.class)
public class CollectionsTest {

    @Test
    public void collectionClasses() {
        List<String> list2 = List.of("A", "B");
        List<String> listN = List.of("A", "B", "C");
        Set<String> set = Set.of("A", "B", "C");
        Map<String, String> map = Map.of("A", "a", "B", "b", "C", "c");
    }

    @Test
    public void collectionsNotEquals() {
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.of("A", "B");
        assertNotSame(list1, list2);
        assertEquals(list1, list2);
    }

}