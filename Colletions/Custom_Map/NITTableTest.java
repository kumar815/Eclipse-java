public class NITTableTest {
	public static void main(String[] args) {
		
		NITTable table = new NITTable();
		System.out.println(table.size());
		System.out.println(table);
		
		table.put("a", 97); System.out.println(table);
		table.put("b", 98); System.out.println(table);
		table.put(99, "c"); System.out.println(table);
		table.put(null, "d"); System.out.println(table);
		table.put("e", null); System.out.println(table);
		
		
	}
}