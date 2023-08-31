package String_v5;

import java.io.PrintStream;
import java.util.Scanner;

public class test03_project {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		PrintStream printStream = new PrintStream(null);
		printStream.println(hashCode());

		// System.out.println(s1.isEmpty());
		// System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s1.length() != 0);
		System.out.println(s1.length() == 0);

		if (s1.length() != 0) {

		}
		if (s1.length() == 0) {

		}
		// System.out.println(s1);

	}

}