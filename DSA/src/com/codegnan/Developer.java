package com.codegnan;
interface Emp {
	void work();
	static void companyName() {
		System.out.println("Xyz");
	}
}
public class Developer implements Emp {
public void work() {
	System.out.println("handling some buggs");
}
public static void main(String[] args) {
	Developer d=new Developer();
		d.work();
	Emp.companyName();
}
}
