package com.Searching;

public class FindInsertionPosition {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int target=2;
		int left=0;
		
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]>target) {
				right=mid-1;
		
			} else {
				left=mid+1;
			}
			
		}
		System.out.println("Insert at :"+left);

	}

}
