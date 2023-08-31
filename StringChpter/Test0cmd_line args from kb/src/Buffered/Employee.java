package Buffered;
//Employee into.java;
//package Buffered;

//import java.io.BufferedInputStream;
import java.io.*;
public class Employee{
	//Dynamic Addition Progrme BufferedReader 
	//must develop create 4steps
	//1.import java io.package
	//2.create to BR class object onnect ot kwyboard
	//3.call BR Readline()method repiredly as many values
	//as we wanted to read
	//4.we must handle io excetion for br.readline method call take.
	
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStream Reader(System.in));		
		System.out.println("Enter eno:");
		int a = Integer.parseInt(br.readline());
		
		System.out.println("Enter ename:");
		String enmae = br.readline();
		
		System.out.println("Enter salary:");
		double sal = Double.parseDouble(br.readline());

		System.out.println("Enter mobile:");
		long mobile = Long.parseLong(br.readline());
		
		System.out.println("Enter dept:");
		String dept = String.parseString(br.readline());
		
		System.out.println("Enter gender:");
		char gender  = Charecter.parse(br.readline().chatAt(0));
		
		System.out.println("Enter status:");
		boolean status = Boolean.parseBoolean(br.readline());
		
		System.out.println(" confirm the value enter");
		System.out.println("Eno:" + eno);
		System.out.println("Sname:" + ename);
		System.out.println("Salary:" + salary);
		System.out.println("Mobile num:" + moblie);
		System.out.println("Depertment:" + dept);
		System.out.println("Gender:" + gender);
		System.out.println("Status:" + status);
		
	}
}
//problam with bufferedReader
/* 1)every value we all reading from kb shoud be converted into its 
  primitive type using wrapper class method.
  //solution
   java 5v anwords scanner class is given for converting  given no into
   primitive type automatically.
  //Wrapper with Scanner class next session check code */
   */
 */