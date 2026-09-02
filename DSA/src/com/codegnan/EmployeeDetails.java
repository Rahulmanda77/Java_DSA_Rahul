package com.codegnan;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		byte experiance=0;
		short departmentId=0;
		int employeeId=0;
		long mobileNum=0;
		float height=0;
		double salary=0;
		boolean filePresent=false;
		BigInteger aadar=BigInteger.ZERO;
		BigDecimal bonus=BigDecimal.ZERO;
		
		String employeeSurName="";
		String employeeFullName="";
		char maritialStatus=' ';
		//EmpId
		System.out.println("Enter Employee Id:");
		if(sc.hasNextInt()) {
			employeeId=sc.nextInt();
		} else {
			System.out.println("Employee id is invalid");
			return;
		}
		
		//EmpName
		System.out.println("Enter Employee SurName:");
		if(sc.hasNext()) {
			employeeSurName=sc.next();
		} else {
			System.out.println("Employee SurName is invalid");
		}
		System.out.println("Enter Employee FullName");
		if(sc.hasNext()) {
			employeeFullName=sc.next();
		} else {
			System.out.println("Employee FullName is invalid");	
		}
		
		//experiance
		System.out.println("Enter Experience:");
		if(sc.hasNextByte()) {
			experiance=sc.nextByte();
		} else
		{
			System.out.println("Invalid experiance");
		}
		
		//departmentId
		System.out.println("Enter departmentId:");
		 if(sc.hasNextShort()) {
			 departmentId=sc.nextShort();
		 } else {
			 System.out.println("Invalid departmentId");
		 }
		 
		 //Mobile Num
		 System.out.println("Enter mobile Num:");
		 if(sc.hasNextLong()) {
			 mobileNum=sc.nextLong();
		 } else {
			 System.out.println("Invalid Mobile Num");
		 }
		 
		 //height
		 System.out.println("Enter height:");
		 if(sc.hasNextFloat()) {
			 height=sc.nextFloat();
		 } else {
			 System.out.println("Invalid height");
		 }
		 
		 //salary
		 System.out.println("Enter salary:");
		 if(sc.hasNextLong()) {
			 salary=sc.nextLong();
		 } else {
			 System.out.println("Invalid salary");
		 }
		 
		//maritialStatus
		System.out.println("Enter maritial status:");
		if(sc.hasNext()) {
			maritialStatus=sc.next().charAt(0);	
		} else {
			System.out.println("maritial Status is invalid");
			
		}
		sc.close();
		

	}

}
