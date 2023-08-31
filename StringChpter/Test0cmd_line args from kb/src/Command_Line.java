
public class Command_Line {
	/*
	//Dynamic Addition Progrme reading input values from keyboard
	// java we can read input values in 6 ways:-
			  1.From Command line
			  2.Calling Buffered Reader Class
			  3.Calling Scanner Class
			  4.Calling Consol Class
			  5.Calling AET ,String ,Gui
			  6.Calling System properties
			  
	 	by using above 6 approches we must read value form kb.
		should subtitiued thoes values &varibles assign place shown below
		
	*/
	public static void main(String[] args) {
		//1.From Command line
		
		//rule:-we must saparate args with space
		int a = Integer.parseInt(args[0]);
		System.out.println("Enter First Number:");
		int b = Integer.parseInt(args[1]); ;
		System.out.println("Enter Second Number:");
		int c =  a+b;
		System.out.println("Result:"+ c);

	}
}
//above progrme dynamical application addition  it is executed with the value given at executuion time
//with out modifying its code,recompling we can change value
//we work with newly given value automitically