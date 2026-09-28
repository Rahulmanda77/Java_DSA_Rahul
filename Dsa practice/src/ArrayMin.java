
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33,53,55,86,22,18};
		int minElement=arr[0];
		for(int i=1;i<arr.length;i++) {
			minElement=Math.min(minElement, arr[i]);
		}
		System.out.println(minElement);

	}

}
