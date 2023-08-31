package Anand.String_v1_v2_v3;

public class Test06_SBufferProb_WhySBuilder {
	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		long time1, time2;

		time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			sb1.append(new Integer(i));
		}
		time2 = System.nanoTime();
		System.out.println(time2 - time1);

		time2 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			StringBuilder append = sb2.append(new Integer(i));
		}
		time1 = System.nanoTime();
		System.out.println(time1 - time2);
	}
}
