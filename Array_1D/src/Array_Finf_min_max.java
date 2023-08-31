
public class Array_Finf_min_max {
	public static void main(String[] args) {
		int[] arr =new int[10];
		arr[0]=20;
		arr[1]=9;
		arr[2]=20;
		arr[3]=34;
		arr[4]=500;
		arr[5]=3;
		arr[6]=120;
		arr[7]=52;
		arr[8]=40;
		arr[9]=10;
		//this is roung initaize //int max=0, min=0;
		//correct initaize 
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
