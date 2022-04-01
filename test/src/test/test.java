package test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class test {
	public static void main(String[] args) {
		writeFile("output.txt","this is the message" );
	}

public static void writeFile(String file, String data) {
	FileWriter writer = new FileWriter(file);
	BufferedWriter bufferedWriter = new BufferedWriter(writer);
	bufferedWriter.data;
	
}
}