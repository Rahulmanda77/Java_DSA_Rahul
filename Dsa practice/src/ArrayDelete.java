
public class ArrayDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,6};
		int delpos=1;
		int newarr[]=new int[arr.length-1];
		for(int i=0;i<delpos;i++) {
			newarr[i]=arr[i];
		}
		for(int i=delpos;i<newarr.length;i++) {
			newarr[i]=arr[i+1];
		}
		for(int x:newarr) {
			System.out.print(x+" ");
		}

	}

}
