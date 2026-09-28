
public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,14,16,19};
		int pos=2;
		int value=15;
		int k=0;
		int newarr[]=new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			newarr[i]=arr[i];
			k++;
		}
		newarr[2]=value;
		for(int i=pos;i<arr.length;i++) {
			newarr[i+1]=arr[i];
			
		}
		for(int i=0;i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}

	}

}
