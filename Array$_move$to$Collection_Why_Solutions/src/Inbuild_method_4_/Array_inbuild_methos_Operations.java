package Inbuild_method_4_;
//inbuild methods not availble in array
//operation:-add,count,search,retrive,remove,replace,insert methods not aviable
//so adding method use only to argrument pass to develop not so many add elements
//if your develop progrme delete method Array index no not Changed 
public class Array_inbuild_methos_Operations {
	public static void main(String[] args) {
		int a[][]=new int[1][2];//declaration and instantiation  
		a[0][1]=10;//initialization  
//	a[1][1]=20;  
//		a[2][2]=70;  
//		a[3][3]=40;   
//		a[4][4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		}}  