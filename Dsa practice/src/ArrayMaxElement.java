
public class ArrayMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,55,98,100,55};
		int maxElement=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxElement=Math.max(maxElement, arr[i]);
		}
		System.out.println(maxElement);

	}

}
