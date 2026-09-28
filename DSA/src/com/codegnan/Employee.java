package com.codegnan;
class Person{
	int Salary=60000;
	public void getSalary(int Salary) {
		Salary=50000;
		System.out.println("Parent salary is "+Salary);
		System.out.println("Parent class salary "+this.Salary);
	}
}

public class Employee extends Person {
	int Salary=30000;
	public void getSalary(double Salary) {
		System.out.println("My parenttime salary is "+Salary);
	}
	public void getSalary(int Salary) {
		Salary=20000;
		System.out.println(Salary);
		System.out.println(this.Salary);
		super.getSalary(40000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.getSalary(10000);

	}

}
