
public class Array_count_String {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]='A';
		arr[1]='b';
		arr[2]='z';
		arr[3]='Y';
		arr[4]='S';
		arr[5]='T';
		arr[6]=120;
		arr[7]=52;
		arr[8]='r';
		arr[9]='M';
		//print count of  UpperCase char in array 
//		for(int i=0;i<arr.length;i++) {
//			int count= 0;
//			if(Character.isUpperCase(arr[i]))
//				count++;				
//			System.out.println("Count:"+(char)count);// uppercase print 1 ++ add
//			System.out.println("Count:"+count);// uppercase print 1 ++ add
//		}
		
//		// Cahr check upperasece R&T in arry
//		for(int i=0;i<arr.length;i++) {
//			int count= 0;
//			if(arr[i]=='R'|| arr[i]=='T')//check T uppercase element avaible 
//				count++;
//			System.out.println("Count:"+count);// uppercase print 1 ++ add
//		}
		
//		// Cahr check vowels R&T in arry
//		for(int i=0;i<arr.length;i++) {
//			int count= 0;
//			if(arr[i]=='A'|| arr[i]=='r')//check A&r upper&lower element avaible 
//				count++;
//			System.out.println("Count:"+count);//print count++ add upp&lower 1 res
//	}
		
		// count of digit in arry
		for(int i=0;i<arr.length;i++) {
			int count= 0;
			if(Character.isDigit(arr[i]))//check char matching digit (convert Ascii behind)
				count++;
			System.out.println("Count:"+count);//print count++ res:1//52 is char avaible
	}
}
}
