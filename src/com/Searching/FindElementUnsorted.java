package com.Searching;

public class FindElementUnsorted {

	public static void main(String[] args) {
		int arr[]= {12,32,47,18,53,97};
		int target=18;
		int left=arr[0];
		int right=arr.length-1;
		while(left<right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("found at :"+mid);
				return;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			} else {
				left=mid+1;
			}
			
		}
		System.out.println("not found");


	}

}
