
public class ArrayMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,1,1,3,2,1,2};
		int majority=-1;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				majority=arr[i];
				break;
			}
		
		}
		System.out.println(majority);
		
		

	}

}
