package com.mru.oops1;

class Parent12{
	int num1 = 100;
}
class child12 extends Parent12{
	int num2 = 50;
}
class child13 extends Parent12{
	int num2 = 25;
}
public class op3 {

	public static void main(String[] args) {
		child12 obj1 = new child12();
		System.out.println(obj1.num1 +obj1.num2);
		
		child13 obj2 = new child13();
		System.out.println(obj2.num1 +obj2.num2);
		
		
		// TODO Auto-generated method stub

	}

}
