package com.codegnan;

interface A{
	void m1();
	public default void sleeping() {
		System.out.println("Sleeping with dreamzz...");
	}
}
interface B{
	public default void sleeping() {
		System.out.println("Sleeping after eating");
	}
}
public class Demo implements A,B {
	public void m1() {
		System.out.println("Working");
	}
	public void sleeping() {
		System.out.println("sleeping with dreamzz after work");
		A.super.sleeping();
		B.super.sleeping();
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.sleeping();
		
		
	}

}
