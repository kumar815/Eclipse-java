package bb;
import java.io.DataInputStream;
import java.io.IOException;

public class Test03_DIS {
	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);

		System.out.print("Enter FNO: ");		
		int a =Integer.parseInt(dis.readLine());

		System.out.print("Enter SNO: ");		
		int b =Integer.parseInt(dis.readLine());		
		
		int c = a + b;
		System.out.println(c);
	}
}