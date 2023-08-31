/**
 * 
 */

/**
 * @author AnandKumar
 * Date 30-05-2023 , Time 4:0:00 PM
 */	
	// wrapper class 6 types\
 	//5v onwords
	/** 
	 1.PDT => WCO Conversion
	 2.WCo => PDT Conversion
	 3.PSO => WCO Conversion
	 4.PSo => PDT Conversion[pso=>wco=>pdt],[pso=>pdt]
	 5.WCO => String Object Conversion
	 6.PDT => NSO(non-string object)
	 
	 */
public class Wrapper_Class {


	private static String s14;

	/**
	 * @param args
	 */

public static void main(String[] args) {
	 //1.PDT => WCO Conversion
//1.4 version conversion
	//Integer i = Integer.valueOf(10);
//5 version conversion
	//Integer i=10;
	
	/*
	int i = 10;
	Integer i1 = new Integer(i);
	Integer i2 = Integer.valueOf(i);
	
	System.out.println("i:" + i);
	System.out.println("i1:" + i1);
	System.out.println("i2:" + i2);
	
	//Byte b1 = new Byte(50);//byte (int) is undefinfed
	Byte b2 = new Byte((byte)50);
	Byte b3 = Byte.valueOf((byte)60);
	Character ch1 = new Character('a');
	Character ch11 = Character.valueOf((Character)'a');
	//Character ch2 = new Character(97);//Character(int) is undefined
	Character ch3 = new Character((char)97);
	Character ch33 = Character.valueOf((char) 97);
	Boolean bo = new Boolean(true);
	Boolean bo1 = Boolean.valueOf(true);
	Float f1 =new Float(70);
	Float f11 = Float.valueOf(70);
	Float f2 =new Float(32.56f);
	Float f22 = Float.valueOf((float) 32.56);
	Float f3 =new Float(50.45);
	Float f33 = Float.valueOf((float) 50.45);
	Double d1 = new Double(67.54);
	Double d11 = Double.valueOf(67.53);
	Double d2 = new Double(98);
	Double d22 = Double.valueOf(98);
//	Double do = new Double('a');//varible do is keyword not conversion
	//System.out.println("b1:" + b1);
	System.out.println("b2:" + b2);
	System.out.println("b3:" + b3);
	System.out.println("ch1:" + ch1);
	System.out.println("ch11:" + ch11);
	//System.out.println("ch2:" + ch2);
	System.out.println("ch3:" + ch3);
	System.out.println("ch33:" + ch33);
	System.out.println("bo:" + bo);
	System.out.println("bo1:" + bo1);
	System.out.println("f1:" + f1);
	System.out.println("f11:" + f11);
	System.out.println("f2:" + f2);
	System.out.println("f22:" + f22);
	System.out.println("f3:" + f3);
	System.out.println("f33:" + f33);
	System.out.println("d1:" + d1);
	System.out.println("d11:" + d11);
	System.out.println("d2:" + d2);
	System.out.println("d22:" + d22);
	//System.out.println("do:" + do); do is a kw so not convert to the wrapper
	*/
	
	 //2.WCo => PDT Conversion
	/*
	Integer io3 = Integer.valueOf(254);
	int   x = io3.intValue();
	byte  b =io3.byteValue();
	short s =io3.shortValue();
	float  f =io3.floatValue();
	
	System.out.println("x:" + x);
	System.out.println("b:" + b);
	System.out.println("s:" + s);
	System.out.println("f:" + f);
	//System.out.println("ch:" + ch);
	
	//find out compile time errors inthe below progrme
	//char ch1 = io3.charValue();
	//char ch2 = io3.intValue();
	char ch11 = (char)io3.intValue();
	//boolean bo1 = io3.booleanValue();
	//boolean bo2 = io3.intValue();
	//boolean bo3 = (boolean)io3.intValue();
	//System.out.println("ch1:" + ch1);
	//System.out.println("ch2:" + ch2);
	//System.out.println("ch11:" + ch11);
	//System.out.println("bo1:" + bo1);
	//System.out.println("bo2:" + bo2);
	//System.out.println("bo3:" + bo3);
	 
	 
	*/
	// 3.PSO => WCO Conversion
	/*
	Integer io1 = new Integer("10");
	Integer io2 = Integer.valueOf("1");
	
	Byte io3 = Byte.valueOf("2");
	//Byte io4 = Byte.valueOf("128");//Value out of range. 
	//Integer io5 = Integer.valueOf("a");//NumberFormatException.forInputString
	//Integer io6 = new Integer("5.4");//NumberFormatException.forInputString
	//Integer io7 = new Integer("10L");//NumberFormatException.forInputString
	//Float fo1 = new Float("5");//NumberFormatException.forInputString
	//Float fo2 = new Float("5.4");//NumberFormatException.forInputString
	//Float fo3 = new Float("523.44F");//.NumberFormatException.forInputString
	System.out.println("io1:"+ io1);
	System.out.println("io2:"+ io2);
	System.out.println("io3:"+ io3);
	//System.out.println("io4:"+ io4);
	//System.out.println("io5:"+ io5);
	//System.out.println("io6:"+ io6);
	//System.out.println("io7:"+ io7);
	//System.out.println("fo1:"+ fo1);
	//System.out.println("fo2:"+ fo2);
	//System.out.println("fo3:"+ fo3);
	*/
	
	
	//boolean String Object = Boolean WCO
	/*
	 * //   flase|true  ->WCO
	Boolean bo1 = new Boolean("true");
	Boolean bo2 = new Boolean("false");
	
	Boolean bo3 = Boolean.valueOf("true");
	Boolean bo4 = Boolean.valueOf("false");
	
	Boolean bo5 = Boolean.valueOf("True");
	Boolean bo6 = Boolean.valueOf("TrUe");
	Boolean bo7 = Boolean.valueOf("False");
	Boolean bo8 = Boolean.valueOf("FaLse");
	Boolean bo9 = Boolean.valueOf("Hari");
	Boolean b10 = Boolean.valueOf("FALSE");
	Boolean b11 = Boolean.valueOf("TRUE");
	Boolean b12 = Boolean.valueOf(null);
	Boolean b13 = Boolean.valueOf("");
	//Integer b14 = Integer.valueOf(null);
	
	System.out.println("bo1:"+ bo1);
	System.out.println("bo2:"+ bo2);
	System.out.println("bo3:"+ bo3);
	System.out.println("bo4:"+ bo4);
	System.out.println("bo5:"+ bo5);
	System.out.println("bo6:"+ bo6);
	System.out.println("bo7:"+ bo7);
	System.out.println("bo8:"+ bo8);
	System.out.println("bo9:"+ bo9);
	System.out.println("b10:"+ b10);
	System.out.println("b11:"+ b11);
	System.out.println("b12:"+ b12);
	System.out.println("b13:"+ b13);
	//System.out.println("b14:"+ b14);
	*/
	
	// 4.PSo => PDT Conversion
	   // I)PSO =>WCO => PDT
	   // II)PSO => PDT
	/*
	int i1 = Integer.parseInt("10");
	//int i2 = Integer.parseInt("10.0");//RE:-N F E for input String "10.0"
	//byte b2 = Byte.parseInt("30");//CE:- C F S
	byte b1 = Byte.parseByte("40");
	//byte b3 = Byte.parseByte("128");CE:-VALURE OUT OF RANGE
	
	System.out.println("i1:"+ i1);	
	//System.out.println("i2:"+ i2);	
	System.out.println("b1:"+ b1);	
	//System.out.println("b3:"+ b3);	
	
	float f1 = Float.parseFloat("10");
	float f2 = Float.parseFloat("10.0");
	float f3 = Float.parseFloat("50.44");
	float f4 = Float.parseFloat("606.678F");
	boolean bo1 = Boolean.parseBoolean("true");
	boolean bo2 = Boolean.parseBoolean("True");
	boolean bo3 = Boolean.parseBoolean("TrUe");
	boolean bo4 = Boolean.parseBoolean("False");
	boolean bo5 = Boolean.parseBoolean("FaLse");
	boolean bo6 = Boolean.parseBoolean("Hari");
	boolean bo7 = Boolean.parseBoolean("FALSE");
	boolean bo8 = Boolean.parseBoolean("TRUE");
	boolean bo9 = Boolean.parseBoolean(null);
	boolean b10 = Boolean.parseBoolean("");
	System.out.println("f1:"+ f1);
	System.out.println("f2:"+ f2);
	System.out.println("f3:"+ f3);
	System.out.println("f4:"+ f4);
	System.out.println("bo1:"+ bo1);
	System.out.println("bo2:"+ bo2);
	System.out.println("bo3:"+ bo3);
	System.out.println("bo4:"+ bo4);
	System.out.println("bo5:"+ bo5);
	System.out.println("bo6:"+ bo6);
	System.out.println("bo7:"+ bo7);
	System.out.println("bo8:"+ bo8);
	System.out.println("bo9:"+ bo9);
	System.out.println("b10:"+ b10);
	*/
	//5.WCO => String Object Conversion
	//Integer io = new Integer(299);//Unresolved compilation problems:
	//System.out.println(io);
	//Integer i1 = Integer.parseInt(i1.toString());
	//System.out.println(i1.toString());
	
	// 6.PDT => NSO
	//String s1 = 10;//CE:incompatible types
	String s2 = "10";
	String s3 = Integer.toString(10);
	//String s4 = Byte.toString(10);//ce:C F S
	String s5 = Byte.toString((byte)10);
	
	//String s6 = Integer.toString(('a');//CE;Unresolved compilation problems: 
	
	//String s7 = Integer.toString(("a");//CE; C F S
	//String s8 = Integer.toString(10.0);//CE: C F S
	
	String s9 =  Float.toString(20);
	String s10 = Float.toString(30L);
	String s11 = Float.toString(40.0F);
	String s12 = Float.toString(50.f);
	s14 = Boolean.toString(false);
	String s15 = Boolean.toString(true);//CE : C F S
	//String s16 =Bollean.toString(TRUE);//CE: C F S varible TRUE 
	
	//System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	System.out.println("s3:"+s3);
	//System.out.println("s4:"+s4);
	System.out.println("s5:"+s5);
	//System.out.println("s6:"+s6);
	//System.out.println("s7:"+s7);
	//System.out.println("s8:"+s8);
	System.out.println("s9:"+s9);
	System.out.println("s10:"+s10);
	System.out.println("s11:"+s11);
	System.out.println("s12:"+s12);
	//System.out.println("s13:"+s13);
	//System.out.println("s14:"+s14);
	System.out.println("s15:"+s15);
	//System.out.println("s16:"+s16);
 }
}

