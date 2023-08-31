package Anand.String_v1_v2_v3;

import java.util.*;

public class Test02_StringHandaling {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter text ");
		String s1 = scn.nextLine();

		if (s1.equals("hari")) {
			// System.out.println("Hello "+s1.toLowerCase());
			System.out.println("Hi " + s1.toUpperCase());

		} else {
			System.out.println("Are You " + s1.concat(" Krishna") + "?");
		}

	}

}
