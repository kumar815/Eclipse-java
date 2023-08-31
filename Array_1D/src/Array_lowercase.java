
public class Array_lowercase {
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
		//print LowerrCase in array 
		for(int i=0;i<arr.length;i++) {
			if(Character.isLowerCase(arr[i]))
				System.out.println((char)arr[i]);//only lowerrcase char print
		}
	}
}
