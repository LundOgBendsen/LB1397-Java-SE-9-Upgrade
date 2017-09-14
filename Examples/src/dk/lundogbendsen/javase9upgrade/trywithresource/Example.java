package dk.lundogbendsen.javase9upgrade.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    static String readFirstLineFromFile(final String path) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(path));
	try (br) {
	    return br.readLine();
	}
    }
}
