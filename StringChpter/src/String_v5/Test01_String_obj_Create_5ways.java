package String_v5;
//Diff ways to ganarate String object(5 ways)

/*
 * 1)String literal			String s1 ="h1";
 * 2)String Constructor		String s2 =new String("nit);
 * 3)String class methods	String s3 = s1.concat(s2);
 * 4) + operator 			String s4 = s3 + "hyb";
 * 5)from keyboard			String s5 = scn.nextLine();
 * */

public class Test01_String_obj_Create_5ways {
	public static void main(String[] args) {
		String s1 = "h1";
		String s2 = new String("nit");
		String s3 = s1.concat(s2);
		String s4 = s3 + "hyb";
		// String s5 = scn.nextLine();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		// System.out.println(s5);
	}
}

/*
 * Note:- pooling is appiled only to the string literal those are appeared in
 * compliation phase,means should be available in class file directly in "".
 * 
 * pooling is not appiled to the string objects those are generating dynamically
 * due to Constructor/method/expression execution.
 * 
 * so only literal approch second obj is not created in 2,3,4 and 5 aporches
 * secong string obj is created even though second obj content is same as first
 * obj.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
