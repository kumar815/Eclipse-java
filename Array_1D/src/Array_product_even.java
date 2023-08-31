
public class Array_product_even {
//find the product of even num's in the array
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=2;
		arr[1]=9;
		arr[2]=2;
		arr[3]=4;
		arr[4]=5;
		arr[5]=2;
		arr[6]=0;
		arr[7]=57;
		arr[8]=40;
		arr[9]=10;
		double product=5;//total calucate and add 5
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				product=product+arr[i];//add even num in array
		}
		System.out.println("even_count_product:"+product);
		//total even num calucate and product 5
		
		
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%2!=0)
//			product=product+arr[i];//add odd num in array
//	}
//	System.out.println("odd_product_num:"+product);//total odd num calucate and print
	
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]>9 && arr[i]<100)
//			product=product+arr[i];//add 2digit num's in array
//	}
//	System.out.println("2digit_num_product_caluclate:"+product);
//	//caluclate 2digit num then total 2digit num + product num 5	
}
}



