package Array_pro;

import Student.student;

//Array type solution used to inheritance 
//parent to child class diff class also 
//implementing "objct[] obj" sloutions
//diff class allowed like student,employee,factory,bus,animal more...
//sample progrms below
public class Array_type_sloution {
	public static void main(String[] args) {
Object[] obj =new Object[9];
obj [0]=new student();
obj [1]=new employee();
obj [2]=new animal();
obj [3]=new factory();
obj [4]=new bank();
obj [5]=5;
obj [6]=7.6;//Double.valuieof(7.5) auto boxing
obj [7]='a';
obj [8]=true;
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  	
	}

}
