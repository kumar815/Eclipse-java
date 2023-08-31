import java.util.Scanner;

public class palindroarrmNum_Str {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Text");
		String s1 = scn.nextLine();
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);

		}
		if (s2.equals(s1)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
}
