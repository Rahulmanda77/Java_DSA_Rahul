package com.Searching;

public class SquareRoot {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,7};
		int target=25;
		int left=0;
		int right=arr.length-1;
		int index=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			int sqr=arr[mid]*arr[mid];
			if(sqr==target) {
				index=mid;
				System.out.println("sqaure root of index: "+index);
				return;
			} else if(sqr>target) {
				right=mid-1;
			} else {
				left=mid+1;
			}
			
		}
		if(index==-1){
			System.out.println("Not found");
			
		}
		

	}

}
