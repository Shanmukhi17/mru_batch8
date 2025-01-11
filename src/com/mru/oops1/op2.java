package com.mru.oops1;
class Parent11{
	public void m1() {
		System.out.println("Parent");
		
	}
}
class child11 extends Parent11{
	public void m2() {
		System.out.println("child");
		
	}
}
class subchild extends child11{
	public void m3() {
		System.out.println("subchild");
		
	}
}

public class op2 {

	public static void main(String[] args) {
		subchild obj = new subchild();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
