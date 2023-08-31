import java.util.Scanner;

public class Test05_Scanner {
	public static void main(String[] args) {
		add();
		sub();
	}
	static void add() {
		Scanner scn = new Scanner(System.in); 
		
		System.out.print("Enter FNO: ");
		int a = scn.nextInt();

		System.out.print("Enter SNO: ");
		int b = scn.nextInt();
		
		int c = a + b;
		System.out.println("Result: "+ c);
		
		//scn.close(); 
	}
	static void sub() {
		Scanner scn = new Scanner(System.in); 
		
		System.out.print("Enter FNO: ");
		int a = scn.nextInt();
		
		System.out.print("Enter SNO: ");
		int b = scn.nextInt();
		
		int c = a - b;
		System.out.println("Result: "+ c);
		
		//scn.close();
	}
}