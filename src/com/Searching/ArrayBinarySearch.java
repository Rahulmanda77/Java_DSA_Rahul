 package com.Searching;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int target=30;
		int left=arr[0];
		int right=arr.length-1;
		boolean found=false;
		while(left<right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("Found"+mid);
				found=true;
				break;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			} else {
				left=mid+1;
			}	
		}
		if(!found) {
			System.out.println("Element found ");
		}
		

	}

}
