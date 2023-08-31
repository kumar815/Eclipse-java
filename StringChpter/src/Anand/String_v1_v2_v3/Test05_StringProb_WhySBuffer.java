package Anand.String_v1_v2_v3;

public class Test05_StringProb_WhySBuffer {
	public static void main(String[] args) {
		String s1 = "anand";
		System.out.println("Before concat:" + s1);
		s1.concat("kumar");
		System.out.println("After concat :" + s1);

		System.out.println();

		String s2 = s1.concat("Reddy");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println();

		s1 = s1.concat("Bangalore");
		System.out.println("s1:" + s1);
		System.out.println();

		// problam:performance issue
		// if u modify string object 1m times.
		// 1m new string object are created

		// so develop new method StringBuffer
		StringBuffer sb1 = new StringBuffer("hari");
		System.out.println("sb1:" + sb1);
		sb1.append("krishna");
		System.out.println("sb1:" + sb1);

	}

}
