package arraysCollection;

public class NITCollation{
	private Object[] elementData;//element data is a varible not store value 
	//private int index;
	
	public NITCollation() {
		elementData = new Object[10];//ctreate the new instance memory	

	}
	public void add(Object obj) {
		int index = 0;
		elementData[index] = obj;
		index++;
		}
		@Override
		public String toString() {
			return (java.util.Arrays.toString(elementData));
		}
	}
