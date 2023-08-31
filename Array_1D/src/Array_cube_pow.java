
public class Array_cube_pow {
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=1;
		arr[1]=9;
		arr[2]=22;
		arr[3]=4;
		arr[4]=15;
		arr[5]=52;
		arr[6]=53;
		arr[7]=51;
		arr[8]=72;
		arr[9]=99;
		for(int i=0;i<arr.length;i++) {
			System.out.println(Math.pow(arr[i],3));
		}
	}
}

