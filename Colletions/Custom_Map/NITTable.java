public class NITTable {
	
	private Object[] keys;
	private Object[] values;
	
	private int size;
	
	public NITTable() {
		keys = new Object[10];
		values = new Object[10];
		size = 0;
	}

	public int capacity() {
		return keys.length;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if(size == 0)
			return "{}";
		
		StringBuilder resBuilder = new StringBuilder();
		resBuilder.append("{");
		
		for(int i=0; i<size(); i++) {
			resBuilder.append(keys[i]);
			resBuilder.append("=");
			resBuilder.append(values[i]);
			resBuilder.append(", ");
		}
		
		int start = resBuilder.lastIndexOf(", ");
		int end = start + 2;
		resBuilder.delete(start, end);
		
		resBuilder.append("}");		
		return resBuilder.toString();
	}

	public void put(Object key, Object value) {

		if(size() == capacity())
			grow();
		
		keys[size] = key;
		values[size] = value;
		size++;
		
	}

	private void grow() {
		Object[] nextKeys = new Object[capacity()*2 ];
		Object[] nextValues = new Object[capacity()*2 ];
		
		for(int i=0; i<capacity(); i++) {
			nextKeys[i] = keys[i];
			nextValues[i] = values[i];
		}
		
		keys = nextKeys;
		values = nextValues;
	}
	
	
	
}
