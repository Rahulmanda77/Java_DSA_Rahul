package pack1;
 class Parent {
	 public void m2() {
		 System.out.println("Hyderabad");
	 }
 }
public class Employeen {
	public void m1() {
		System.out.println("codegnan");
	}


public static void main(String [] args) {
	Employeen emp=new Employeen();
	emp.m1();
	Parent p=new Parent();
	p.m2();
}
}