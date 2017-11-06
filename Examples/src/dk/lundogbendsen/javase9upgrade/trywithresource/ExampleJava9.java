package dk.lundogbendsen.javase9upgrade.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleJava9 {
    static String readFirstLineFromFile(final String path) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(path));
	
	//The reference to the resource (br) is all what is needed
	try (br) {
	    return br.readLine();
	}
	
	//Java will automatically call close() on the resource no matter what happens
    }
}
