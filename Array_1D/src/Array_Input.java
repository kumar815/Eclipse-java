import java.util.*;
public class Array_Input {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println(scn);

	}

}
