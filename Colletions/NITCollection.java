//NITCollection.java
/**
 * This class is used for solving Object[] problems <br>
 * In this class we will solve array type, size and inbuilt operations problems <br>
 * We call this collection as custom collection, because we are creating 
 * this collection class by our own
 * 
 * @author HK
 * @since 1.0
 */
public class NITCollection {
	/**
	 *  Field to store Object[] object 
	 */ 
	private Object[] elementData;
	
	/** 
	 * Filed for counting number of objects stored in collection
	 * It is also used for giving index number for storing next element 
	 * in this collection 
	 */
	private int elementCount;
	
	/**
	 * Constructor for creating empty collection with default capacity 10 <br>
	 * and incremental capacity double. 
	 */
	public NITCollection(){
		elementData = new Object[10];
		elementCount = 0;
	}
	
	/**
	 * It adds given object in this collection <br>
	 * When size reached to capacity it does not throw exception <br>
	 * It grows array capacity to double the current capacity
	 * 
	 *  @param obj object to store in this collection
	 */	
	public void add(Object obj) { 
		if(size() == capacity())
			grow();
		
		elementData[elementCount] = obj;
		elementCount++;
	}
	/** 
	 * method for increasing capacity of the collection
	 * it implements growable array algorithm. 
	 */
	private void grow() {
		Object[] nextArray = new Object[capacity()*2];
		
		for (int i=0; i<elementData.length; i++) {
			nextArray[i] = elementData[i]; 
		}
		
		elementData = nextArray;
	}
	
	/**
	 * Returns capacity of this collection
	 * 
	 *  @return current capacity
	 */
	public int capacity() {
		return elementData.length;
	}

	/**
	 * Returns size of this collection
	 * 
	 *  @return current size
	 */
	public int size() {
		return elementCount;
	}

	/**
	 * returns collection elements in string format
	 * 
	 * @return returns collection elements
	 */
	@Override
	public String toString() {
		/* returning [] if collection is empty */
		if(size()==0)
			return "[]";
		
		StringBuilder resBuilder= new StringBuilder();
		resBuilder.append("[");
		
		//storing all elements of collection up to size 
		//in StringBuilder object with , space
		Object[] eD = elementData;
		for(int i=0; i<size(); i++) {
			resBuilder.append(eD[i]);
			resBuilder.append(", ");
		}
		
		//removing last , space from StringBuilder
		int start = resBuilder.lastIndexOf(", ");
		if(start >= 0) {
			int end = start + 2;  //2 is number of characters to remove
			resBuilder.delete(start, end);
		}
		
		resBuilder.append("]");
		
		
		return resBuilder.toString();  //converting StringBuilder object to String
										//and returning to println() method, 
										//or to the calling place
	}
	
	/**
	 * searching the given argument matched object in this collection <br>
	 * this method implements linear searching algorithm
	 * 
	 * @param obj object for searching the element in collection
	 * @return 	true if found
	 * 			false if not found
	 */
	public boolean contains(Object obj) {
		return indexOf(obj)>=0;
	}
	
	/**
	 * This method returns first occurrence of given object
	 * 
	 *  @param obj object for searching 
	 *  @return index number of this object's first occurrence 
	 */
	public int indexOf(Object obj) {
		Object[] eD = elementData;
		
		if(obj == null) {
			for(int i=0; i<size(); i++) {
				if(eD[i] == null)
					return i;
			}
			return -1;
		} else {
			for(int i=0; i<size(); i++) {
				if(obj.equals(eD[i]))
					return i;
			}
			return -1;
		}		
	}
	
	/**
	 * This method returns last occurrence of given object
	 * 
	 *  @param obj object for searching 
	 *  @return index number of this object's last occurrence 
	 */
	public int lastIndexOf(Object obj) {
		Object[] eD = elementData;
		
		if(obj == null) {
			for(int i=size()-1; i>=0; i--) {
				if(eD[i] == null)
					return i;
			}
			return -1;
		} else {
			for(int i=size()-1; i>=0; i--) {
				if(obj.equals(eD[i]))
					return i;
			}
			return -1;
		}		
	}
	/**
	 * Returns given index object from this collection
	 * 
	 * @param index
	 * @return object 
	 */
	public Object get(int index) {
		checkIndex(index);		
		return elementData[index];
	}
	
	/**
	 * removes given object from this collection
	 * 
	 * @param obj object to be removed
	 * @return 
	 * 		true if object removed
	 * 		false if object is not removed
	 */
	public boolean remove(Object obj) {
		Object[] eD = elementData;
		
		if(obj == null) {
			for(int i=0; i<size(); i++) {
				if(eD[i] == null) {
					remove(i);
					return true;
				}					
			}
			return false;
		}else {
			for(int i=0; i<size(); i++) {
				if(obj.equals(eD[i])) {
					remove(i);
					return true;
				}					
			}
			return false;
		}
	}

	/**
	 * removes given index object from this collection
	 * 
	 * @param index for removing object
	 * @return 
	 * 		the removed object
	 */
	public Object remove(int index) {
		checkIndex(index);
		
		Object[] eD = elementData;
		
		Object ele = eD[index];
		
		for( ; index<size()-1; index++) {
			eD[index] = eD[index+1];
		}
		eD[size()-1] = null;
		elementCount--;
		
		return ele;
	}

	/**
	 * Insert given object in given index location
	 * 
	 * @param index location to store 
	 * @param obj   object to insert
	 * 
	 */
	public void add(int index, Object obj) {
		
		if(index<0 || index>size()) 
			throw new IndexOutOfBoundsException(index);
		
		if(size() == capacity())
			grow();
		
		Object[] eD = elementData;
		for(int i=size()-1; i>=index; i--) {
			eD[i+1] = eD[i];
		}
		
		eD[index] = obj;
		elementCount++;
	}
	
	/**
	 * replacing an object in the given index
	 * 
	 * @param index the location for replacing object
	 * @param obj   the object to store
	 */
	public Object set(int index, Object obj) {
		checkIndex(index);
		
		Object ele = elementData[index];
		elementData[index] = obj;
		return ele;
	}
	
	/**
	 * for checking whether the passed index is valid or not
	 * 
	 * @param index
	 */
	private void checkIndex(int index) {
		if(index <0 || index>=size())
			throw new IndexOutOfBoundsException(index);
	}
}
