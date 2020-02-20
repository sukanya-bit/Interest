package interest;

import java.io.IOException;
import java.util.Scanner;

public class Simple_Compound {
	
	private static Interest in;
	@SuppressWarnings("unused")
	private static Simple_Compound sC;
	private static Scanner scan = new Scanner(System.in);
	private static double ans = 0;

	public Simple_Compound() {
		in = new Interest();
	}

	public static void main(String[] args) throws IOException {
		sC = new Simple_Compound();
		while (true) {
			in.input();
			System.out.write("\n 1. Simple Interest.".getBytes());
			System.out.write("\n 2. Compound Interest.".getBytes());
			System.out.write("\n 3. Exit.".getBytes());
			int ch = scan.nextInt();
			switch (ch) {
			case 1 : ans = in.simple_in();
					in.output(ans);
					break;
			case 2 : ans = in.compound_in();
					in.output(ans);
					break;
			case 3 : System.exit(0);
			}
		}
	}

}
