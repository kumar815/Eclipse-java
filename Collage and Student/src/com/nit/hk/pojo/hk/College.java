package com.nit.hk.pojo.hk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nit.hk.pojo.Student;

public class College {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		Student s1 = new Student();
		System.out.println("s1 object details");
		System.out.println(s1);
		
		System.out.print("\nEnter sno: ");
		s1.setSno(Integer.parseInt(br.readLine()));
		
		System.out.print("Enter sname: ");
		s1.setSname(br.readLine());

		System.out.print("Enter course: ");
		s1.setCourse(br.readLine());

		System.out.print("Enter fee: ");
		s1.setFee(Double.parseDouble(br.readLine()));

		System.out.print("Enter email: ");
		s1.setEmail(br.readLine());

		System.out.print("Enter mobile: ");
		s1.setMobile(Long.parseLong(br.readLine()));

		System.out.print("Enter gender: ");
		s1.setGender(br.readLine().charAt(0));

		System.out.print("Enter studying: ");
		s1.setStudying(Boolean.parseBoolean(br.readLine()));
		
		System.out.println("\ns1 object details");
		System.out.println(s1);
	}
}