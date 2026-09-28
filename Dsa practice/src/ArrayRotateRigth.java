
public class ArrayRotateRigth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int k=2;
		for(int r=1;r<=k;r++) {
			int first=arr[0];
			for(int i=arr.length-1;i>=0;i--) {
				arr[i]=arr[i];
			}
			arr[arr.length-1]=first;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
