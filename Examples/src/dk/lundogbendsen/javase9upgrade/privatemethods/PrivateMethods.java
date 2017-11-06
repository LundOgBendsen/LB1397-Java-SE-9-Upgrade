package dk.lundogbendsen.javase9upgrade.privatemethods;

public interface PrivateMethods {
    public default int foo() {
	return calculateTheAnswerForLifeTheUniverseAndEverything();
    }

    public default int bar() {
	return calculateTheAnswerForLifeTheUniverseAndEverything();
    }

    private int calculateTheAnswerForLifeTheUniverseAndEverything() {
	return 42;
    }
}
