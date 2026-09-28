package com.Searching;

import java.util.Arrays;
import java.util.List;

public class FindNameForArrayList {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("pen","paper","book","pencil");
		String target="book";
		boolean found=false;
		for(String a:li) {
			if(li.equals(target)) {
				found=true;
				break;
			}
		}
		System.out.println(found?"found":"not found");

	}

}
