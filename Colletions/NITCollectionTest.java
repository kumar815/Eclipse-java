public class NITCollectionTest {
	public static void main(String[] args) {
		
		NITCollection col = new NITCollection();
		System.out.println(col.capacity());
		System.out.println(col.size());
		System.out.println(col); //col.toString()
		System.out.println(); //col.toString()
		
//Operation #1: adding object without type and size limitation		
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
		
		col.add(true); 	System.out.println(col);
		System.out.println();

	//Operation #2: counting number of objects 
		System.out.println(col.capacity());
		System.out.println(col.size());
		System.out.println();
	
	//Operation #3: Printing objects available in collection
		System.out.println(col);
		System.out.println();
		
	//Operation #4: searching given object in collection 
		System.out.println(col.contains("a")); //true
		System.out.println(col.contains("A")); //false
		System.out.println(col.contains(null)); //true
		System.out.println();
		
	//Operation #5: finding index of given object in collection 
		System.out.println(col.indexOf("a")); //0
		System.out.println(col.indexOf("A")); //-1
		System.out.println(col.indexOf(null)); //5
		System.out.println();
		
	//Operation #6: finding last index of given object in collection 
		System.out.println(col.lastIndexOf("a")); //6
		System.out.println(col.lastIndexOf("A")); //-1
		System.out.println(col.lastIndexOf(null)); //5
		System.out.println();
		
	//Operation #7: retrieving given index object from the collection
		System.out.println(col.get(0));
		System.out.println(col.get(4));
		System.out.println(col.get(10));
		//System.out.println(col.get(-1)); //RE: IOOBE
		//System.out.println(col.get(11)); //RE: IOOBE
		System.out.println();
		
	//Operation #8: removing given object from the collection
		System.out.println(col.size());
		System.out.println(col);
		System.out.println(col.remove("b"));
		System.out.println(col);
		System.out.println(col.remove(null));
		System.out.println(col);
		System.out.println(col.remove("A"));
		System.out.println(col);
		System.out.println(col.size());
		System.out.println();

	//Operation #9: removing given index object from the collection	
		System.out.println(col.remove(3));
		System.out.println(col);
		System.out.println(col.size());
		//System.out.println(col.remove(-3)); RE: IOOBE
		System.out.println();
		
	//Operation #10: inserting an object in the given location
		System.out.println(col.size());
		System.out.println(col);
		col.add(2, "X");
		System.out.println(col);
		System.out.println(col.size());
		
	}
}