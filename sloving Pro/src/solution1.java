import java.util.*;
class solution1 {
	private static Scanner scn;
	public void Roman(int num) {
		scn = new Scanner(System.in); 
		System.out.print("Enter FNO: ");
		
		ArrayList[] list = new Arraylist[{
			
		}]
		ArrayList<String> INR = new ArrayList<>();
	        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	        String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	        String[] ths = {"","M","MM","MMM"};
	        
	        int num = 0;
			return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
	    }
		
public static void main (String[] args) {
	
    }
}