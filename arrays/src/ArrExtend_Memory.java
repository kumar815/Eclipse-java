public class ArrExtend_Memory{
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] =1;
		a[1] =2;
		a[2] =3;
		a[3] =4;
		a[4] =5;
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);	
		}
		int[] a1 = new int[10]; 
		for(int i=0;i<a.length;i++){
			a1[i]=a[i];
			}
			a=a1;
	a1[5]=6;
	a1[6]=7;
	a1[7]=8;
	a1[8]=9;
	a1[9]=10;
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}
	
}
