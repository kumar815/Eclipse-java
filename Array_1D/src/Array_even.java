public class Array_even {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]=1;
		arr[1]=3;
		arr[2]=3;
		arr[3]=4;
		arr[4]=15;
		arr[5]=5;
		arr[6]=50;
		arr[7]=50;
		arr[8]=70;
		arr[9]=55;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)//even check
			System.out.println("even num:"+arr[i]);
		}
	}
}
