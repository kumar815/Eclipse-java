import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04_BR {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter FNO: ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("Enter SNO: ");
		int b = Integer.parseInt(br.readLine());
		
		int c = a + b;
		System.out.println("Result: "+ c);
		
		//br.close(); //Brain less Tumri fellow
	}
}
