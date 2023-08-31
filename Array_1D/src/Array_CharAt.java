
public class Array_CharAt{
	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0]="THIS";
		arr[1]="ONE";
		arr[2]="DOING";
		arr[3]="HEllo";
		arr[4]="AM";
		arr[5]="I";
		arr[6]="Hi BYE";
		arr[7]="ROCK";
		arr[8]="Talk";
		arr[9]="TOP";
		//print char first letter in array
		for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i].charAt(0));//Only print firsr char
		}
	}
}

