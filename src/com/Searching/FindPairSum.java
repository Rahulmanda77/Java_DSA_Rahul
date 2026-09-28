package com.Searching;

public class FindPairSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int target=6;
		int left=0;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("found pairs :"+arr[i]+" "+arr[j]);
					found=true;
					break;
				} 
				
			}
		}
		if(!found) {
			System.out.println("not found");
		}

	}

}
