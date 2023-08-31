
public class Array_Spaces {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]='A';
		arr[1]='b';
		arr[2]='z';
		arr[3]='Y';
		arr[4]='s';
		arr[5]='a';
		arr[6]='b';
		arr[7]=52;
		arr[8]=' ';
		arr[9]='M';
		//print Spaces in array 
		for(int i=0;i<arr.length;i++) {
			//if(!Character.isWhitespace(arr[i]))
			//if(!Character.isSpaceChar(arr[i]))
			if(Character.isSpace((char) arr[i]))
				System.out.println(arr[i]);//only spaces print
		}
	}
}

