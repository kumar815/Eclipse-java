package Anand.String_v1_v2_v3;

public class Test04_CharArrPro_StringSlou {
	public static void main(String[] args) {
		// char arr problams length,size,code modularity
		// mutiple time qouts wrote and index seaching problam
		// code redandency and not understand very well
		// over come tghe problames use to string
		char[] ch = { 'h', 'a', 'r', 'i', };
		// ch[4]='n';
		// ch.xxx()//no methods
		System.out.println(ch);

		String str = "Anand";
		System.out.println(str);
		System.out.println(str.concat("Kumar"));

		// str.xxx();//have methods
		System.out.println(str.toUpperCase());
		str = str.concat("Kumar");
		System.out.println(str.toUpperCase());

	}

}
