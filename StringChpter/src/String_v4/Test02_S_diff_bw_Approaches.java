package String_v4;

//what are  the diff b/w these aproaches?
//there are 2 difference

//1)number of objects creation
//2)String Pooling

/*diff #1:
 * number of objects creation
 * -with String literal only one object is created(0 or1)
 * -with new kw two object are created(1 or 2)
 */
/*diff #2:
 * String Pooling
 * -leteral comes under pooling (by default string literal is intern)
 * -new kw object does not come under string pooling (by default new kw obj
 */

public class Test02_S_diff_bw_Approaches {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";

		String s3 = new String("a");
		String s4 = new String("b");
		String s5 = new String("b");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		System.out.println();

		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
		System.out.println(s4 == s5);// false
	}

}
