//find the sum of even num's in the array
public class Array_find_sum_even {
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=2;
		arr[1]=9;
		arr[2]=2;
		arr[3]=4;
		arr[4]=5;
		arr[5]=2;
		arr[6]=10;
		arr[7]=57;
		arr[8]=70;
		arr[9]=19;
		double sum=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0)
//				sum=sum+arr[i];//add even num in array
//		}
//		System.out.println("even:"+sum);//total even num calucate and print
		
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%2!=0)
//			sum=sum+arr[i];//add odd num in array
//	}
//	System.out.println("odd:"+sum);//total odd num calucate and print
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>9 && arr[i]<100)
			sum=sum+arr[i];//add 2digit num's in array
	}
	System.out.println("2digit_num caluclate total:"+sum);
	//caluclate 2digit num then total	
}
}


