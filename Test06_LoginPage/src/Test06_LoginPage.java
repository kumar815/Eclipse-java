import java.io.Console;

public class Test06_LoginPage {
	public static void main(String[] args) {
		//Rule: we must run this program only in System CMD window
		//if we run this program either in Eclipse or in Editplus console
		//we will get RE: NPE, System.console() returns null
		Console cns = System.console();
		
		System.out.print("Enter username: ");
		String usn = cns.readLine();
		
		System.out.print("Enter password: ");
		String pwd = new String(cns.readPassword());
		
		System.out.println("Username: "+ usn);
		System.out.println("Password: "+ pwd);	
		
	}
}