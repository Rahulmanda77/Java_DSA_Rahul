package com.inheritance;

class Guest{
	public void read() {
		System.out.println("Reads the data");
	}
	
}
class Developer extends Guest{
	public void write() {
		System.out.println("Write the data");
	}
	
}

public class Admin extends Developer {
	public void delete() {
		System.out.println("Deletes the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a=new Admin();
		a.read();
		a.write();
		a.delete();

	}

}
