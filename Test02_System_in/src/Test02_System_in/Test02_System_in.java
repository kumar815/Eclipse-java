package Test02_System_in;
import java.io.IOException;

public class Test02_System_in {
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter FNO: ");
		int a = System.in.read();
		System.out.println("a: "+ a);
		System.out.println("a: "+ (char)a);
	}
}