package String_v5;
//identify how many string obj are createdijn below statement

import java.util.Scanner;

public class Test2_Str_obj {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		String s1 = "a";
		String s2 = "a";
		String s3 = "A";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();

		String s4 = new String("a");
		String s5 = new String("b");
		String s6 = new String("b");
		String s7 = new String(s6);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println();

		String s8 = s1.concat(s2);
		String s9 = s1.concat(s2);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println();

		String s10 = s1 + s2;
		String s11 = s1 + s2;
		System.out.println(s10);
		System.out.println(s11);
		System.out.println();

		String s12 = "b";
		String s13 = "ab";
		String s14 = "a" + "b";
		String s15 = s1 + s2;
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);

		String s16 = scn.nextLine();
		String s17 = scn.nextLine();
		System.out.println(s16);
		System.out.println(s17);
	}

}
