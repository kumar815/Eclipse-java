package arraysCollection;
public class NITCollationTest {
	public static void main(String[] args) {
		NITCollation col = new NITCollation();
		
		System.out.println(col);//call .tostring()
		col.add("a");System.out.println(col);
		col.add("b");System.out.println(col);
		col.add(5);System.out.println(col);
		col.add(6.7);System.out.println(col);
		col.add('p');System.out.println(col);
	}

}

