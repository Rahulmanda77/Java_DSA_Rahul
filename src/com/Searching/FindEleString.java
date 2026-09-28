package com.Searching;

public class FindEleString {

	public static void main(String[] args) {
		String [] arr= {"Rahul","Nani","Aditya","uday"};
		String target="Nani";
		boolean found=false;
		for(String str:arr) {
	       if(str.equals(target)) {
		 found=true;
		 break;
	 }
		}
		System.out.println(found?"found element":"not found");

	}

}
