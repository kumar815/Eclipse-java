public class Array_char_ascii {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]='A';
		arr[1]='b';
		arr[2]='z';
		arr[3]='Y';
		arr[4]='s';
		arr[5]='a';
		arr[6]=120;
		arr[7]=52;
		arr[8]='r';
		arr[9]='M';
		//print all char in array with ascii convert
		for(int i=0;i<arr.length;i++) {
			System.out.println("conver to ascii:"+(int)arr[i]);//cast opertor used
		}
		
//		//print alm char in arry with ascii value add a serial number to each line
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(i+1+(int)arr[i]);//cast opertor used
//			}
	}

}
