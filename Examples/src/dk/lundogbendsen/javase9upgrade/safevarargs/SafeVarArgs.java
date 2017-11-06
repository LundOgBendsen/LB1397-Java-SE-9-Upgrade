package dk.lundogbendsen.javase9upgrade.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgs {

    @SafeVarargs // Ikke rigtigt sandt!! prøv at se hvad der sker når du fjerner annotationen...
    static void m(List<String>... stringLists) {
	// stringLists vil af java automatisk blive pakket som et array af String list
	// altså som en List<String>[]

	Object[] objectArray = stringLists;

	List<Integer> intList = Arrays.asList(42);

	objectArray[0] = intList; // Lovligt men semantisk forkert!!!

	List<String> listOfStrings = stringLists[0];

	String s = listOfStrings.get(0); // Øv... ClassCastException under RUNTIME!
    }
}
