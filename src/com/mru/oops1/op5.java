package com.mru.oops1;
class Parent111{
	public void dbConn() {
		System.out.println("data from oracle soon.....!");
		
	}
}
class child122 extends Parent111{
	public void dbConn() {
		System.out.println("data from mongodb soon.....!");
	}
}

public class op5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child122 obj = new child122();
		obj.dbConn();

	}

}
