import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;
/*
 * Java 7v new features
 * 	1. try-with-resource
 * 	2. catch with multiple exceptions
 */


public class Java7NewFeatures {
	public static void main(String[] args) throws IOException{
		
	//Java 6v code	
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("abc.txt");
//			System.out.println(fis.read());
//			//fis.close();
//		}catch(FileNotFoundException e) {
//			//fis.close();
//			e.printStackTrace();
//			System.out.println("=============================");
//
//			System.out.println(e); //e.toString()
//			System.out.println("=============================");
//			
//			System.out.println(e.getMessage());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(fis!=null)fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		//Java 7v onwards we no need to write finally block
//		//for calling close() method, compiler will add
//		//this feature is named as try-with-resource
//		
//		try(
//		    FileReader fr = new FileReader("abc.txt") 
//		    		//this object is called resource(connection based object)				
//	    ) {
//			
//		}catch (FileNotFoundException e) {	//for FR constructor
//			System.out.println("FNFE is raised");	
//			
//		}catch (IOException e) { //for implicit call of fr.close() 
//			e.printStackTrace();
//		}
//		/*
//		 *  ||
//		 * \||/
//		 */
//		/*
//			FileReader fr = null;
//			try {
//				fr = new FileReader("abc.txt") 
//				fr.read();
//			}finally{
//				if(fr!=null) 
//					fr.close();
//			}
//		 */ 	
//		
		try(
			PrintStream ps = new PrintStream(System.out)
		){
			ps.println("Hi");
		}//ps.close();
		
		//we can write try-with-resource without catch and finally association
		//because it is implicitly try-with-finally
		
		System.out.println("Hello");
		
//Rule #1:	The object type must be AutoCloseable type	
		//try(String s1 = "HK"){ }
		
//Rule #2:	We must handle the checked exceptions throwing by 
			//implicit call to close() method and this resource
			//constructor and methods calls
		//try(Connection con = DriverManager.getConnection(null)) { }
		
//Rule #3: We must initialize resource variable either with null or object 
		//try(PrintStream ps){}
		try(PrintStream ps = null){}
		//try(Connection con = null){} //CE: for not hanlding SQLException for close()

		try(Connection con = null){} //CE: for not hanlding SQLException for close()
		catch (SQLException e) {
			e.printStackTrace();
		}

//Rule #4: In Java 7v and 8v we can not use outer object as try-resource
		//we must use one local variable in try() 
		//from Java 9v onwards we can directly use our object reference 
		//as resource
		
		FileReader fr = new FileReader("bbc.txt");
		//try(fr) {} //CE: in Java 7v and 8v
		//catch (IOException e) {}
		
		try(FileReader fr2 = fr){ } //solution in Java 7v and 8v
		catch (IOException e) {}

//		try(fr){ } //solution in Java 9v improvement
//		catch (IOException e) {}
		
//Rule #5: The ref var used inside try() can not be used after try{ }
		//The ref var used before try() and used as resource can not be used
		//after try{ } because its object is connection is closed
		//fr2.read();  //CE
		//fr.read();	//RE
		
//Rule #6: 	Inside try() we can place mulitple resources
		//they must be separated by ;
		//if we place only one resource object ; is optional 
		try(
				PrintStream ps1 = new PrintStream("abc.txt"); //mandatory				
				PrintStream ps2 = new PrintStream("bbc.txt")
		){ }
		
		
//Rule #7: 	in try() we must place only variable declaration
		//that too AutoCloseble type ref var declation
		//if we place not variable declaraion or method calls
		//or just object creation, we will get CE: 
		try(
				PrintStream ps1 = new PrintStream("abc.txt"); //optional
				//ps1.print("Hi");
			){ }
		
	//Upto Java 6v 	
		try {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pass integers");
		}catch(NumberFormatException e) { 
			System.out.println("Pass only integers");
		}catch (ArithmeticException e) {
			System.out.println("Do not pass ZERO as second argument");	
		}catch (Exception e) {
			e.printStackTrace();
		}

		//Upto Java 7v 	- catch with multiple exceptions
		try {
			
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException  e) {
			System.out.println("Pass integers, only integers");
		}catch (ArithmeticException e) {
			System.out.println("Do not pass ZERO as second argument");	
		}catch (Exception e) {
			e.printStackTrace();
		}

//Rule #1: separator must be | and must use only only parameter name

//Rule #2: The exception classes must not super and sub types
		//all exceptions must be siblings
		try {
			
		}
		//catch(ArrayIndexOutOfBoundsException | Exception  e) {}
		//catch(Exception | ArrayIndexOutOfBoundsException  e) {}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException  e) {}

	}
	
}
