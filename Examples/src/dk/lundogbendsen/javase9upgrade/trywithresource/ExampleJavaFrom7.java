package dk.lundogbendsen.javase9upgrade.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleJavaFrom7 {
    static String readFirstLineFromFile(final String path) throws IOException {
	try (BufferedReader br = new BufferedReader(new FileReader(path));) {
	    return br.readLine();
	}
	
	//Java will automatically call close() on the resource no matter what happens
    }
}
