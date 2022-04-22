package exp;

import java.io.IOException;
import java.io.PrintWriter;

public class ForLoop {
	public static void main(String[] args) throws IOException {
		int row = 5;
		if(row <= 0) {
			throw new IllegalArgumentException("invalid input");
		}
	for(row=5 ; row >= 1 ; row--) {
		for(int column=0 ; column < row ; column++) {
			System.out.print("*");
			}
		System.out.println("\n");
		}
	PrintWriter out = new PrintWriter("result.txt");
	out.println();
	
	}
}
