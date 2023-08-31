
public class Array_odd {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]=1;
		arr[1]=3;
		arr[2]=3;
		arr[3]=4;
		arr[4]=15;
		arr[5]=5;
		arr[6]=52;
		arr[7]=53;
		arr[8]=72;
		arr[9]=51;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)//odd check
			System.out.println("odd num:"+arr[i]);
		}
	}

}
