
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int n=arr.length;
		int result=(n*(n+1))/2-sum;
		System.out.println(result);

	}

}
