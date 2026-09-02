package com.codegnan;
interface Calculator{
	public int add(int a,int b);
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator cat=new calculator() {
//			public int add(int a,int b) {
//				return a+b;
//			}			
//		};
		Calculator ct=(a,b)->{return a+b;};
		System.out.println(ct.add(10, 20));

	}

}
