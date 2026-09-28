package com.Searching;

import java.util.Arrays;

public class ZerosMovesToEnd {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,3,0,4};
		int slow=0;
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]!=0) {
				int temp=arr[slow];
				arr[slow]=arr[fast];
				arr[fast]=temp;
				slow++;
			}
		}
		System.out.println(Arrays.toString(arr));
	

	}

}
