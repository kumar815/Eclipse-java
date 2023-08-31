package Anand.String_v1_v2_v3;

public class Test07_StrSBSBuilderRelation {
	public static void m1(String str) {
	}

	public static void main(String[] args) {
		String str = "Anand";

//StringBuffer str1 = "Anand";//no reslt cre obj below
//StringBuilder str2 = "Anand";//no res cre obj below	
		StringBuffer sb3 = new StringBuffer("Anand");
		StringBuilder sb4 = new StringBuilder("Anand");

		System.out.println(str);
		System.out.println(sb3);
		System.out.println(sb4);

		CharSequence cs1 = "Hari";
		CharSequence cs2 = new StringBuffer("Hari");
		CharSequence cs3 = new StringBuilder("Hari");

		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);

	}

	@SuppressWarnings("unused")
	private static void m2(StringBuffer sb3) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unused")
	private static StringBuilder m3(StringBuilder sb4) {
		// TODO Auto-generated method stub
		return sb4;
	}
}
