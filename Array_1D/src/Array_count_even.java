public class Array_count_even {
//find the count of even num's in the array
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=20;
		arr[1]=9;
		arr[2]=2;
		arr[3]=4;
		arr[4]=500;
		arr[5]=2;
		arr[6]=120;
		arr[7]=52;
		arr[8]=40;
		arr[9]=10;
		int count=0;
		//total no of element even num  res:9 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		System.out.println("even_count:"+count);
		
		
//		//divisible by 5
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%5==0)
//			count++;//
//	}
//	System.out.println("odd_count_num:"+count);
	
//		//count of 3digit numbers
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]>99 && arr[i]<1000)
//			count++;//2digit tho  caluclate res:5
//	}
//	System.out.println("3digit_num_count_caluclate:"+count);
	
//	//ending of no's ending with 2
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]%10==2)
//			count++;//end with 2how many elements caluclate res:3
//	}
//	System.out.println("endwith_num_count_caluclate:"+count);
}
}




