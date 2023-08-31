
public class Array_2digit_divisible {
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=95;
		arr[1]=9;
		arr[2]=22;
		arr[3]=4;
		arr[4]=15;
		arr[5]=52;
		arr[6]=53;
		arr[7]=30;
		arr[8]=72;
		arr[9]=45;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0)//divisible by 5
			System.out.println(arr[i]);
		}
	}
}
