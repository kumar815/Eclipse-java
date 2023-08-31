package Adding_obj_incrementCapacity;
//import.col.java;
public class Adding_Custom_Develop {
	public Adding_Custom_Develop(Adding_Custom_Develop col) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Adding_Custom_Develop col= new Adding_Custom_Develop (col);
		col.add("a");  	System.out.println(col); 
		col.add("b");  	System.out.println(col); 
		col.add(5);  	System.out.println(col); 
		col.add(6.7);  	System.out.println(col); 
		col.add('p');  	System.out.println(col); 
		col.add(null);  System.out.println(col); 
		col.add("a");  	System.out.println(col); 
		col.add(5);  	System.out.println(col); 
		col.add(6.7);  	System.out.println(col); 
		col.add('p');  	System.out.println(col);
		
	//	col.add(true); 	System.out.println(col);
		System.out.println();
		
	}

	private void add(double d) {
		// TODO Auto-generated method stub
		
	}

	private void add(int i) {
		// TODO Auto-generated method stub
		
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
