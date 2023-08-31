//containes method is a searching method
public class Array_contains {
	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0]="THIS";
		arr[1]="ONE";
		arr[2]="DOING";
		arr[3]="HEllo";
		arr[4]="AM";
		arr[5]="AND";
		arr[6]="Hi BYE";
		arr[7]="ROCK";
		arr[8]="Talk";
		arr[9]="TOP";
		//String array and print all string which with "T"//"She","He","I","R"
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains("AND"))//searching method containe
				System.out.println(arr[i]);//Avaible AND print
		}
	}
}

